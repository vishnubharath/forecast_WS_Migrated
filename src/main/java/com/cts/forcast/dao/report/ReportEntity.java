package com.cts.forcast.dao.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Forecast_Reports")
public class ReportEntity {
	
	@Id
	@Column(name = "Report_Id")
	private Long reportId;
	@Column(name = "Project_Id")
	private Long projectId;

	public Long getReportId() {
		return reportId;
	}
	public void setReportId(Long reportId) {
		this.reportId = reportId;
	}
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

}
