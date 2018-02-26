package com.cts.forcast.controller;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.forcast.dao.report.ReportEntity;
import com.cts.forcast.domain.report.Adjustment;
import com.cts.forcast.domain.report.ForcastReport;
import com.cts.forcast.service.ReportsService;

@Controller
@CrossOrigin
@RestController
@RequestMapping("/reports")
public class ReportsController {

	@Autowired
	private ReportsService reportsService;

	@RequestMapping(value = "/reports/project/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<ReportEntity> getReportsByProjectId(@PathVariable Integer id) {
		return reportsService.getByProjectId(id);
	}

	@RequestMapping(value = "/reports/employee/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<ReportEntity> getReportsByEmployeeId(@PathVariable Integer id) {
		return reportsService.getByEmployeeId(id); 
	}

	@RequestMapping(value = "/reports/check/{empId}/{pjtId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<ReportEntity> getReportByEmpProject(@PathVariable Integer empId, @PathVariable Integer pjtId) {
		return reportsService.getByEmpProject(empId, pjtId);
	}

	@RequestMapping(value = "/all", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<ForcastReport> getALLReports() {
		System.out.println("Enterting /reports/all");
		return reportsService.getAll();	
	}

	@RequestMapping(value = "/reports/hours/{locationType}/{locationId}/{year}/{month}", method = RequestMethod.GET, headers = "Accept=application/json")
	public float getWorkingHours(@PathVariable String locationType, @PathVariable Integer locationId,
			@PathVariable Integer year, @PathVariable Integer month) {
		return 0.0F; // reportsService.getHours(locationType, locationId, year,
						// month);
	}

	@RequestMapping(value = "/reports/leaves/all", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<ReportEntity> getAllLeaves() {
		return reportsService.getAllLeaves();
	}
	
	
	@RequestMapping(value = "/saveRowRecord", method = RequestMethod.POST)
	@Consumes(value=javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public void saveRowRecord(@RequestBody List<Adjustment> rep) {
		
		for(Adjustment adjustment : rep) {
			System.out.println(adjustment.getId());
			System.out.println(adjustment.getAdjusment());
			System.out.println(adjustment.getHours());
			System.out.println(adjustment.getRate());
		}		
		reportsService.updateRecords(rep);		
	}
	
	@RequestMapping(value = "/reports/saveRecord", method = RequestMethod.POST, headers = "Accept=application/json")
	public void saveRecord(@RequestBody ReportEntity rep) {
		reportsService.updateRecord(rep);		
	}
	
	@RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
	public String getReportsByProjectId() {
		return HttpStatus.OK.name();
	}
}
