package com.cts.forcast.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.forcast.domain.pipeline.GetStaffingRevenueResponse;
import com.cts.forcast.domain.pipeline.InsertPipelineRequest;
import com.cts.forcast.domain.pipeline.PipelineOppRequest;
import com.cts.forcast.domain.pipeline.PipelineOppResponse;
import com.cts.forcast.domain.pipeline.StaffingPipelineRequest;
import com.cts.forcast.domain.pipeline.StaffingPipelineResponse;
import com.cts.forcast.domain.pipeline.StaffingResponse;
import com.cts.forcast.service.PipelineService;

@CrossOrigin
@RestController
@RequestMapping("/pipeline")
public class PipelineController {

	@Autowired
	PipelineService pipelineService;

	@RequestMapping(value = "/get/staffing/{YrMonth}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Collection<StaffingResponse> getStaffingPipelineData(@PathVariable Integer YrMonth) {
		return pipelineService.getStaffingPipeline(YrMonth);
	}

	@RequestMapping(value = "/get/staffing/revenue/{YrMonth}", method = RequestMethod.GET, headers = "Accept=application/json")
	public GetStaffingRevenueResponse getStaffingRevenue(@PathVariable Integer YrMonth) {
		return pipelineService.getStaffingRevenue(YrMonth);
	}
	@RequestMapping(value = "/put/staffing", method = RequestMethod.POST, headers = "Accept=application/json")
	public StaffingPipelineResponse insertStaffingPipeline(@RequestBody InsertPipelineRequest staffingRequest) {
		return pipelineService.insertStaffingPipeline(staffingRequest);
	}
	
	@RequestMapping(value = "/get/opportunity/{YrMonth}", method = RequestMethod.GET, headers = "Accept=application/json")
	public PipelineOppResponse getOpportunityPipeline(@PathVariable Integer YrMonth) {
		return pipelineService.getOpportunityPipeline(YrMonth);
	}
	
	@RequestMapping(value = "/put/opportunity", method = RequestMethod.PUT, headers = "Accept=application/json")
	public PipelineOppResponse insertOpportunityPipeline(PipelineOppRequest opportunityRequest) {
		return pipelineService.insertOpportunityPipeline(opportunityRequest);
	}

}
