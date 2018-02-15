package com.cts.forcast.domain.report;

import java.util.List;

public class UpdateReportRequest {
	private List<Report> report;

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UpdateReportRequest [reportList=").append(report).append("]");
		return builder.toString();
	}



	public List<Report> getReport() {
		return report;
	}



	public void setReport(List<Report> report) {
		this.report = report;
	}
	
	

}
