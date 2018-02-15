package com.cts.forcast.service.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.forcast.common.PersistentFields;
import com.cts.forcast.dao.report.ReportsDao;
import com.cts.forcast.domain.report.Report;
import com.cts.forcast.service.ReportsService;

@Service("reportsService")
public class ReportsServiceImpl implements ReportsService {

	//@Autowired
	private ReportsDao reportsDao;

	@SuppressWarnings("serial")
	public Collection<Report> getByEmployeeId(final Integer id) {

		return null;
		/*return reportsDao.get(new HashMap<String, Object>() {
			{
				put(PersistentFields.EMPLOYEE_ID_FIELD, id);
			}
		});*/
	}

	@SuppressWarnings("serial")
	public Collection<Report> getByProjectId(final Integer id) {

		return null;
		/*return reportsDao.get(new HashMap<String, Object>() {
			{
				put(PersistentFields.PROJECT_ID_FIELD, id);
			}
		});*/
	}

	public Collection<Report> getByEmpProject(final Integer employeeId, final Integer projectId) {

		return null;
		/*Collection<Report> lstReport = reportsDao.get(new HashMap<String, Object>() {
			{
				put(PersistentFields.EMPLOYEE_ID_FIELD, employeeId);
				put(PersistentFields.PROJECT_ID_FIELD, projectId);
			}
		});
		return lstReport;*/
	}

	public Collection<Report> getAll() {
		return reportsDao.getAll();
	}

	public void updateRecords(List<Report> rep) {
		// List<List<Report>> reports = Lists.partition(rep, batchSize);
		rep.forEach(report -> {
			// VBJ reportsDao.update(report);
		});

	}

	@Override
	public void saveRecords(List<Report> rep) {

	}

	public Collection<Report> getAllLeaves() {
		return reportsDao.getAllLeavesFromHistory();
	}

}
