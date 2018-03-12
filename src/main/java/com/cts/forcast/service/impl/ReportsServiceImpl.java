package com.cts.forcast.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.forcast.dao.report.ReportAdjustmentEntity;
import com.cts.forcast.dao.report.ReportAdjustmentRepository;
import com.cts.forcast.dao.report.ReportEntity;
import com.cts.forcast.dao.report.ReportRepository;
import com.cts.forcast.domain.report.ForcastReport;
import com.cts.forcast.domain.report.ReportAdjusment;
import com.cts.forcast.service.ReportsService;

@Service("reportsService")
public class ReportsServiceImpl implements ReportsService {

	@Autowired
	private ReportRepository reportRepository;

	@Autowired
	private ReportAdjustmentRepository adjustmentRepository;

	public Collection<ForcastReport> getByProjectIds(List<Long> projectIds) throws ParseException {
		return mapForecastReport(reportRepository.findByProjectIdIn(projectIds));
	}

	public Collection<ForcastReport> getAll() throws ParseException {
		List<ForcastReport> forcastReports = mapForecastReport(reportRepository.findAllReportsWithLimited());
		return forcastReports;
	}

	@Override
	public void saveRecords(List<ReportEntity> rep) throws Exception {

		Calendar cal = Calendar.getInstance();
		String month = new SimpleDateFormat("MMM").format(cal.getTime());

		Long year = (long) Calendar.getInstance().get(Calendar.YEAR);

		for (ReportEntity forcast : rep) {

			// Updating existing records
			if (forcast.getReportAdjustmentEntity() != null && forcast.getReportAdjustmentEntity().size() > 0) {
				if (adjustmentRepository.exists(forcast.getReportAdjustmentEntity().get(0).getId())) {
					forcast.getReportAdjustmentEntity().forEach(repAdjustmentEntity -> {
						repAdjustmentEntity.setReportentity(forcast);
						adjustmentRepository.save(repAdjustmentEntity);
					});

					// Inserting new records(duplicate/added records
					// insertion)
				} else {
					forcast.getReportAdjustmentEntity().forEach(repAdjustmentEntity -> {

						repAdjustmentEntity.setActualYear(year);
						repAdjustmentEntity.setActualMonth(month);
						try {
							repAdjustmentEntity.setRef_Date_Forecast(createRefDate(
									repAdjustmentEntity.getForecastedMonth(), repAdjustmentEntity.getForecastedYear()));
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						repAdjustmentEntity.setReportentity(forcast);

					});
					Date allocStartDate = forcast.getAllocStartDate();
					Date allocEndDate = forcast.getAllocEndDate();
					forcast.setAllocStartDate(convertDate(allocStartDate, true));
					forcast.setAllocEndDate(convertDate(allocEndDate, true));
					forcast.setActualMonth(month);
					forcast.setActualYear(year.toString());

					reportRepository.save(forcast);
				}

			}

		}

		System.out.println("Saved");

	}

	private List<ForcastReport> mapForecastReport(Iterable<ReportEntity> reportsEntities) throws ParseException {
		List<ForcastReport> forcastReports = new ArrayList<>();
		for (ReportEntity reportEntity : reportsEntities) {
			ForcastReport forecastReport = new ForcastReport();
			forecastReport.setReportId(reportEntity.getReportId());
			forecastReport.setProjectId(reportEntity.getProjectId());
			forecastReport.setCustomerId(reportEntity.getCustomerId());
			forecastReport.setCustomerName(reportEntity.getCustomerName());
			forecastReport.setProjectName(reportEntity.getProjectName());
			forecastReport.setPortfolio(reportEntity.getPortfolio());
			forecastReport.setPOC(reportEntity.getPoc());
			forecastReport.setProjectBillability(reportEntity.getProjectBillability());
			forecastReport.setAssociateId(reportEntity.getAssociateId());
			forecastReport.setAssociateName(reportEntity.getAssociateName());
			forecastReport.setAssociateGrade(reportEntity.getAssociateGrade());
			forecastReport.setLocationType(reportEntity.getLocationType());
			forecastReport.setAssociateCity(reportEntity.getAssociateCity());
			forecastReport.setBillableType(reportEntity.getBillableType());
			forecastReport.setAllocationPercentage(reportEntity.getAllocationPercentage());
			forecastReport.setAllocStartDate(convertDate(reportEntity.getAllocStartDate(), false));
			forecastReport.setAllocEndDate(convertDate(reportEntity.getAllocEndDate(), false));

			List<ReportAdjustmentEntity> reportAdjustmentEntities = reportEntity.getReportAdjustmentEntity();

			reportAdjustmentEntities.sort(Comparator.comparing(ReportAdjustmentEntity::getRef_Date_Forecast,
					Comparator.nullsFirst(Comparator.naturalOrder())));
			List<ReportAdjusment> reportCostingList = new ArrayList<>();
			for (ReportAdjustmentEntity reportAdjustmentEntity : reportAdjustmentEntities) {
				ReportAdjusment reportAdjustment = new ReportAdjusment();
				reportAdjustment.setId(reportAdjustmentEntity.getId());
				reportAdjustment.setAdjustment(reportAdjustmentEntity.getAdjustment());
				reportAdjustment
						.setHours(reportAdjustmentEntity.getHours() == null ? 0 : reportAdjustmentEntity.getHours());
				reportAdjustment.setRate(reportAdjustmentEntity.getRate());
				reportAdjustment.setRevenue(reportAdjustmentEntity.getRevenue());
				reportAdjustment.setForecastedMonth(reportAdjustmentEntity.getForecastedMonth());
				reportAdjustment.setForecastedYear(reportAdjustmentEntity.getForecastedYear());
				reportAdjustment.setActualMonth(reportAdjustmentEntity.getActualMonth());
				reportAdjustment.setActualYear(reportAdjustmentEntity.getActualYear());
				reportCostingList.add(reportAdjustment);
			}
			forecastReport.setReportAdjustmentEntity(
					reportCostingList.toArray(new ReportAdjusment[reportCostingList.size()]));
			forcastReports.add(forecastReport);
		}
		return forcastReports;
	}

	public void deleteRecord(List<ReportEntity> rep) {
		for (ReportEntity forcast : rep) {

			if (forcast.getReportAdjustmentEntity() != null && forcast.getReportAdjustmentEntity().size() > 0) {
				forcast.getReportAdjustmentEntity().forEach(repAdjustmentEntity -> {
					repAdjustmentEntity.setReportentity(forcast);
					adjustmentRepository.delete(repAdjustmentEntity);
				});

			}

			reportRepository.delete(forcast);
		}
	}

	private String formatDate(Date date) {
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		return df.format(date);
	}

	private Date convertDate(Date date, boolean isUpdated) throws ParseException {
		Date dateconverted = null;
		DateTimeFormatter formatter = null;
		LocalDate ld = null;
		if (isUpdated) {
			formatter = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss z uuuu").withLocale(Locale.US);
			ZonedDateTime zdt = ZonedDateTime.parse(date.toString(), formatter);
			ld = zdt.toLocalDate();
			DateTimeFormatter fLocalDate = DateTimeFormatter.ofPattern("uuuu-MM-dd");
			String output = ld.format(fLocalDate);
			System.out.println("Date Converted:" + output);
			DateFormat targetDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			dateconverted = targetDateFormat.parse(output);
			System.out.println("final Date:" + dateconverted);
		} else {
			// formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd
			// HH:mm:ss.S").withLocale(Locale.US);
			ZoneId indianZone = ZoneId.of("Asia/Kolkata");
			formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss.S");
			LocalDateTime localtDateAndTime = LocalDateTime.parse(date.toString(), formatter);
			ZonedDateTime zdt = ZonedDateTime.of(localtDateAndTime, indianZone);
			ld = zdt.toLocalDate();
			DateTimeFormatter fLocalDate = DateTimeFormatter.ofPattern("uuuu-MM-dd");
			String output = ld.format(fLocalDate);
			System.out.println("Date Converted:" + output);
			DateFormat targetDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			dateconverted = targetDateFormat.parse(output);
		}

		return dateconverted;
	}

	private Date createRefDate(String forecastedMonth, long forecastedYear) throws ParseException {

		Date date = new SimpleDateFormat("MMM").parse(forecastedMonth);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int monthNumber = cal.get(Calendar.MONTH);
		cal.clear();
		cal.set(Calendar.MONTH, monthNumber);
		cal.set(Calendar.YEAR, (int) forecastedYear);
		Date referenceDateForecasted = cal.getTime();

		return referenceDateForecasted;

	}
}
