package com.cts.forcast.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.cts.forcast.dao.report.ReportEntity;
import com.cts.forcast.domain.common.GenericError;
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
		Collection<ForcastReport> reportsList = null;
		try {
			reportsList = reportsService.getByProjectIds(list);
		} catch (ParseException exception) {
			exception.printStackTrace();
		}
		return reportsList;

	}

	@RequestMapping(value = "/all", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<ForcastReport> getALLReports() {
		System.out.println("Enterting /reports/all");
		Collection<ForcastReport> reportsList = null;
		try {
			reportsList = reportsService.getAll();
		} catch (ParseException exception) {
			exception.printStackTrace();
		}
		return reportsList;
	}

	@RequestMapping(value = "/saveRecords", method = RequestMethod.POST)
	@Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public void saveRecords(@RequestBody List<ReportEntity> rep) throws Exception {

		reportsService.saveRecords(rep);

	}

	@RequestMapping(value = "/deleteRecords", method = RequestMethod.POST)
	@Consumes(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public void deleteRecords(@RequestBody List<ReportEntity> rep) {
		reportsService.deleteRecord(rep);
	}

	@ExceptionHandler({ Exception.class })
	public ResponseEntity<Object> handleAll(Exception ex, WebRequest request) {
		ex.printStackTrace();
		GenericError error = new GenericError(HttpStatus.INTERNAL_SERVER_ERROR, ex.getLocalizedMessage(),
				"error occurred");
		return new ResponseEntity<>(error, new HttpHeaders(), error.getStatus());
	}

	@ExceptionHandler({ ParseException.class })
	public ResponseEntity<Object> handleAll(ParseException ex, WebRequest request) {
		GenericError error = new GenericError(HttpStatus.INTERNAL_SERVER_ERROR, ex.getLocalizedMessage(),
				"Parse error occurred");
		return new ResponseEntity<>(error, new HttpHeaders(), error.getStatus());
	}

}
