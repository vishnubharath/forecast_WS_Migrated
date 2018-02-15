package com.cts.forcast.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.forcast.domain.report.Report;
import com.cts.forcast.service.ReportsService;

@Controller
@CrossOrigin
@RestController
@RequestMapping("/reports")
public class ReportsController {

	@Autowired
	private ReportsService reportsService;

	@RequestMapping(value = "/reports/project/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<Report> getReportsByProjectId(@PathVariable Integer id) {
		return reportsService.getByProjectId(id);
	}

	@RequestMapping(value = "/reports/employee/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<Report> getReportsByEmployeeId(@PathVariable Integer id) {
		return reportsService.getByEmployeeId(id);
	}

	@RequestMapping(value = "/reports/check/{empId}/{pjtId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<Report> getReportByEmpProject(@PathVariable Integer empId, @PathVariable Integer pjtId) {
		return reportsService.getByEmpProject(empId, pjtId);
	}

	@RequestMapping(value = "/reports/all", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<Report> getFilterCondition() {
		System.out.println("Enterting /reports/all");
		//return reportsService.getAll();
		List<Report> list=new ArrayList<Report>();
		for(int i=0;i<100;i++) {
			Report rep=new Report();
			rep.setEmployeeId(new Random().nextLong());
			rep.setProjectId(new Random().nextLong());
			rep.setLocationId(new Random().nextLong());
			rep.setEsaProjectName("Esatest.."+i);
			rep.setLocation("location.."+i);
			rep.setAssociateName("associateName.."+i);
			rep.setLob("lob.."+i);
			rep.setType("type.."+1);
			rep.setLeave_days("day.."+i);
			rep.setTotalRate(new BigDecimal("0.02"));
			rep.setMonth("May");
			rep.setYear(2018);
			rep.setTotalHours(i);
			rep.setAllocation_end_date(new Date());
			rep.setAllocation_start_date(new Date());
			rep.setVacationNonBillableDays(i);
			rep.setVacationNonBillableHours(i);
			rep.setRate(0.0f);
			rep.setLocation_type("chennai");
			list.add(rep);
		}
		return list;
	}

	@RequestMapping(value = "/reports/hours/{locationType}/{locationId}/{year}/{month}", method = RequestMethod.GET, headers = "Accept=application/json")
	public float getWorkingHours(@PathVariable String locationType, @PathVariable Integer locationId,
			@PathVariable Integer year, @PathVariable Integer month) {
		return 0.0F; // reportsService.getHours(locationType, locationId, year,
						// month);
	}

	@RequestMapping(value = "/reports/leaves/all", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<Report> getAllLeaves() {
		return reportsService.getAllLeaves();
	}
	
	
	@RequestMapping(value = "/reports/saveRowRecord", method = RequestMethod.POST, headers = "Accept=application/json")
	public void saveRowRecord(@RequestBody List<Report> rep) {
		reportsService.updateRecords(rep);		
	}
	
	@RequestMapping(value = "/healthcheck", method = RequestMethod.GET)
	public String getReportsByProjectId() {
		return HttpStatus.OK.name();
	}
}
