package com.cts.forcast.service;

import java.text.ParseException;
import java.util.Collection;
import java.util.List;

import com.cts.forcast.dao.report.ReportEntity;
import com.cts.forcast.domain.report.ForcastReport;

public interface ReportsService {

	public Collection<ForcastReport> getByProjectIds(List<Long> projectIds) throws ParseException;

	public Collection<ForcastReport> getAll() throws ParseException;

	public void saveRecords(List<ReportEntity> rep) throws Exception;

	public void deleteRecord(List<ReportEntity> rep);

}
