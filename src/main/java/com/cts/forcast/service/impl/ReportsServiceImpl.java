package com.cts.forcast.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cts.forcast.dao.report.ReportEntity;
import com.cts.forcast.dao.report.ReportRepository;
import com.cts.forcast.service.ReportsService;

@Service("reportsService")
public class ReportsServiceImpl implements ReportsService {

	@Autowired
	private ReportRepository reportRepository;

	@SuppressWarnings("serial")
	public Collection<ReportEntity> getByEmployeeId(final Integer id) {

		return null;
		/*return reportsDao.get(new HashMap<String, Object>() {
			{
				put(PersistentFields.EMPLOYEE_ID_FIELD, id);
			}
		});*/
	}

	@SuppressWarnings("serial")
	public Collection<ReportEntity> getByProjectId(final Integer id) {

		return null;
		/*return reportsDao.get(new HashMap<String, Object>() {
			{
				put(PersistentFields.PROJECT_ID_FIELD, id);
			}
		});*/
	}

	public Collection<ReportEntity> getByEmpProject(final Integer employeeId, final Integer projectId) {

		return null;
		/*Collection<Report> lstReport = reportsDao.get(new HashMap<String, Object>() {
			{
				put(PersistentFields.EMPLOYEE_ID_FIELD, employeeId);
				put(PersistentFields.PROJECT_ID_FIELD, projectId);
			}
		});
		return lstReport;*/
	}

	public Collection<ReportEntity> getAll() {
		return reportRepository.findAllReportsWithLimited();
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

	/*public Collection<ReportEntity> getAllLeaves() {
		return reportsDao.getAllLeavesFromHistory();
	}*/

}
