package com.cts.forcast.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.forcast.dao.report.ReportAdjustmentEntity;
import com.cts.forcast.dao.report.ReportAdjustmentRepository;
import com.cts.forcast.dao.report.ReportEntity;
import com.cts.forcast.dao.report.ReportRepository;
import com.cts.forcast.domain.report.Adjustment;
import com.cts.forcast.domain.report.ForcastReport;
import com.cts.forcast.domain.report.ReportAdjusment;
import com.cts.forcast.service.ReportsService;

@Service("reportsService")
public class ReportsServiceImpl implements ReportsService {

	@Autowired
	private ReportRepository reportRepository;

	@Autowired
	private ReportAdjustmentRepository adjustmentRepository;

	public Collection<ReportEntity> getByEmployeeId(final Integer id) {

		return null;
	}

	public Collection<ForcastReport> getByProjectIds(List<Long> projectIds) {
		return mapForecastReport(reportRepository.findByProjectIdIn(projectIds));
	}

	public Collection<ReportEntity> getByEmpProject(final Integer employeeId, final Integer projectId) {

		return null;
	}

	public Collection<ForcastReport> getAll() {
		List<ForcastReport> forcastReports = mapForecastReport(reportRepository.findAllReportsWithLimited());
		return forcastReports;
	}

	public void updateRecords(List<Adjustment> adjustments) {

		for (Adjustment adjustment : adjustments) {
			if (adjustment.getId() != null) {
				ReportAdjustmentEntity reportAdjustmentEntity = adjustmentRepository.findOne(adjustment.getId());
				System.out.println(reportAdjustmentEntity.getAdjustment());
				reportAdjustmentEntity.setAdjustment(adjustment.getAdjusment());
				reportAdjustmentEntity.setHours(adjustment.getHours());
				reportAdjustmentEntity.setRate(adjustment.getRate());
				adjustmentRepository.save(reportAdjustmentEntity);
			}

		}

	}

	@Override
	public void saveRecords(List<ReportEntity> rep) {

		System.out.println("Enter into /report/duplicateRecordSave");
		Calendar cal = Calendar.getInstance();
		String month = new SimpleDateFormat("MMM").format(cal.getTime());

		Long year = (long) Calendar.getInstance().get(Calendar.YEAR);
		/*
		 * List<ReportEntity> duplicatedReportEntities =
		 * rep.stream().filter(item -> item.getReportId() == null)
		 * .collect(Collectors.toList()); List<ReportEntity>
		 * updatedReportEntities = rep.stream().filter(item ->
		 * item.getReportId() != null) .collect(Collectors.toList());
		 */
		/* if (!duplicatedReportEntities.isEmpty()) { */
		for (ReportEntity forcast : rep) {

			if (forcast.getReportAdjustmentEntity() != null && forcast.getReportAdjustmentEntity().size() > 0) {
				if (adjustmentRepository.exists(forcast.getReportAdjustmentEntity().get(0).getId())) {
					adjustmentRepository.save(forcast.getReportAdjustmentEntity());
				} else {
					forcast.getReportAdjustmentEntity().forEach(repAdjustmentEntity -> {

						repAdjustmentEntity.setActualYear(year);
						repAdjustmentEntity.setActualMonth(month);
						repAdjustmentEntity.setReportentity(forcast);

					});
					forcast.setActualMonth(month);
					forcast.setActualYear(year.toString());
					reportRepository.save(forcast);
				}

			}

			System.out.println(
					forcast.getAssociateCity() + " " + forcast.getCustomerName() + " " + forcast.getProjectName());

		}

		System.out.println("Saved");
	}

	@Override
	public Collection<com.cts.forcast.dao.report.ReportEntity> getAllLeaves() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateRecord(ReportEntity rep) {
		reportRepository.save(rep);
	}

	private List<ForcastReport> mapForecastReport(Iterable<ReportEntity> reportsEntities) {
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

			List<ReportAdjustmentEntity> reportAdjustmentEntities = reportEntity.getReportAdjustmentEntity();
			List<ReportAdjusment> reportCostingList = new ArrayList<>();
			for (ReportAdjustmentEntity reportAdjustmentEntity : reportAdjustmentEntities) {
				ReportAdjusment reportAdjustment = new ReportAdjusment();
				// reportAdjustment.setId(reportAdjustmentEntity.getId());
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
			forecastReport.setReportAdjustmentEntity(reportCostingList);
			forcastReports.add(forecastReport);
		}
		return forcastReports;
	}

	public void deleteRecord(List<ReportEntity> rep) {
		for (ReportEntity forcast : rep) {

			if (forcast.getReportAdjustmentEntity() != null && forcast.getReportAdjustmentEntity().size() > 0) {
				adjustmentRepository.delete(forcast.getReportAdjustmentEntity());
			}

			reportRepository.delete(forcast);
		}
	}

}
