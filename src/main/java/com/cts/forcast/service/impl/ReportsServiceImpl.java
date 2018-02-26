package com.cts.forcast.service.impl;

import java.util.ArrayList;
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
import com.sun.org.apache.bcel.internal.generic.NEW;

@Service("reportsService")
public class ReportsServiceImpl implements ReportsService {

	@Autowired
	private ReportRepository reportRepository;
	
	@Autowired
	private ReportAdjustmentRepository adjustmentRepository;

	@SuppressWarnings("serial")
	public Collection<ReportEntity> getByEmployeeId(final Integer id) {

		return null;
	}

	@SuppressWarnings("serial")
	public Collection<ReportEntity> getByProjectId(final Integer id) {

		return null;
	}

	public Collection<ReportEntity> getByEmpProject(final Integer employeeId, final Integer projectId) {

		return null;
	}

	public Collection<ForcastReport> getAll() {		
		
		List<ForcastReport> forcastReports = new ArrayList<ForcastReport>();
			
		Iterable<ReportEntity> reportsEntities = reportRepository.findAllReportsWithLimited();
		for(ReportEntity reportEntity : reportsEntities) {
			ForcastReport forecastReport = new ForcastReport();
			forecastReport.setReportId(reportEntity.getReportId());
			forecastReport.setProjectId(reportEntity.getProjectId());
			
			forecastReport.setCustomerId(reportEntity.getCustomerId());
			forecastReport.setCustomerName(reportEntity.getCustomerName());
			forecastReport.setProjectName(reportEntity.getProjectName());
			
			//System.out.println(fr.getProjectName());
			
			forecastReport.setPortfolio(reportEntity.getPortfolio());
			forecastReport.setPOC(reportEntity.getPoc());
			forecastReport.setProjectBillability(reportEntity.getProjectBillability());
			forecastReport.setAssociateId(reportEntity.getAssociateId());
			forecastReport.setAssociateName(reportEntity.getAssociateName());
			forecastReport.setAssociateGrade(reportEntity.getAssociateGrade());
			forecastReport.setLocation(reportEntity.getLocationType());
			forecastReport.setCity(reportEntity.getAssociateCity());
			forecastReport.setBillability(reportEntity.getBillableType());
			
			
			List<ReportAdjustmentEntity> reportAdjustmentEntities = reportEntity.getReportAdjustmentEntity();
			List<ReportAdjusment> reportCostingList = new ArrayList<>();
			for(ReportAdjustmentEntity reportAdjustmentEntity :reportAdjustmentEntities){
				ReportAdjusment reportAdjustment = new ReportAdjusment();
				reportAdjustment.setId(reportAdjustmentEntity.getId());
				reportAdjustment.setAdjustment(reportAdjustmentEntity.getAdjustment());
				reportAdjustment.setHours(reportAdjustmentEntity.getHours());
				reportAdjustment.setRate(reportAdjustmentEntity.getRate());
				reportAdjustment.setRevenue(reportAdjustmentEntity.getRevenue());
				reportAdjustment.setForecastedMonth(reportAdjustmentEntity.getForecastedMonth());
				reportAdjustment.setForecastedYear(reportAdjustmentEntity.getForecastedYear());
				reportAdjustment.setActualMonth(reportAdjustmentEntity.getActualMonth());
				reportAdjustment.setActualYear(reportAdjustmentEntity.getActualYear());
				reportCostingList.add(reportAdjustment);
			}
			forecastReport.setReportAdjusments(reportCostingList);
			forcastReports.add(forecastReport);
		}
		
		return forcastReports;
	}

	public void updateRecords(List<Adjustment> adjustments) {
		
		for(Adjustment adjustment : adjustments) {
			if(adjustment.getId() != null) {
				ReportAdjustmentEntity reportAdjustmentEntity = adjustmentRepository.findOne(adjustment.getId());
				System.out.println(reportAdjustmentEntity.getAdjustment());
				reportAdjustmentEntity.setAdjustment(adjustment.getAdjusment());
				
				adjustmentRepository.save(reportAdjustmentEntity);
			}
		}
		
	}

	@Override
	public void saveRecords(List<ReportEntity> rep) {

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

	/*public Collection<ReportEntity> getAllLeaves() {
		return reportsDao.getAllLeavesFromHistory();
	}*/

}
