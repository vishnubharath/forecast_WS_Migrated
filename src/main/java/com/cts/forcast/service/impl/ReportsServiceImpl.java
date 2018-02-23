package com.cts.forcast.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.forcast.dao.report.ReportEntity;
import com.cts.forcast.dao.report.ReportRepository;
import com.cts.forcast.domain.report.ForcastReport;
import com.cts.forcast.service.ReportsService;

@Service("reportsService")
public class ReportsServiceImpl implements ReportsService {

	@Autowired
	private ReportRepository reportRepository;

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
			
		Iterable<ReportEntity> reportsEntities = reportRepository.findAll();
		for(ReportEntity rp : reportsEntities) {
			ForcastReport fr = new ForcastReport();
			fr.setReportId(rp.getReportId());
			fr.setProjectId(rp.getProjectId());
			
			// TODO: Need to do more mapping
			
			forcastReports.add(fr);
		}
		
		return forcastReports;
	}

	public void updateRecords(List<ReportEntity> rep) {
		// List<List<Report>> reports = Lists.partition(rep, batchSize);
		rep.forEach(report -> {
			// VBJ reportsDao.update(report);
		});

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
