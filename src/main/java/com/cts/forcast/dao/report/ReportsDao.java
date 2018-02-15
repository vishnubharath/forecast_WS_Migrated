package com.cts.forcast.dao.report;

import java.util.Collection;
import java.util.List;

import com.cts.forcast.common.dao.GenericDao;
import com.cts.forcast.domain.report.Report;

public interface ReportsDao extends GenericDao<Report> {

	Collection<Report> getAllLeaves();

	Collection<Report> getAllLeavesFromHistory();

	void saveAllFields(List<Report> reports);

}
