package com.cts.forcast.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.forcast.dao.report.ReportEntity;
import com.cts.forcast.domain.report.ForcastReport;
import com.cts.forcast.service.ReportsService;

@Controller
@CrossOrigin
@RestController
@RequestMapping("/reports")
public class ReportsController {

	@Autowired
	private ReportsService reportsService;

	@RequestMapping(value = "/project", method = RequestMethod.GET)
	// TODO : Need to map the query param in a list
	public Collection<ForcastReport> getReportsByProjectIds(@QueryParam("requestBy") String requestBy) {

		// ****** TODO : need to update the logic
		if (requestBy == null)
			return null;

		List<Long> list = new ArrayList<>();

		String[] stringIDValues = requestBy.split(",");
		for (String str : stringIDValues) {
			list.add(Long.parseLong(str));
		}

		return reportsService.getByProjectIds(list);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<ForcastReport> getALLReports() {
		System.out.println("Enterting /reports/all");
		return reportsService.getAll();
	}

	@RequestMapping(value = "/saveRecords", method = RequestMethod.POST)
	@Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public void saveRecords(@RequestBody List<ReportEntity> rep) {

		reportsService.saveRecords(rep);

	}

	@RequestMapping(value = "/deleteRecords", method = RequestMethod.POST)
	@Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public void deleteRecords(@RequestBody List<ReportEntity> rep) {
		reportsService.deleteRecord(rep);
	}

}
