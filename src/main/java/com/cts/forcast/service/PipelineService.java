package com.cts.forcast.service;


import com.cts.forcast.domain.pipeline.StaffingPipelineResponse;
import com.cts.forcast.domain.pipeline.StaffingResponse;

import java.util.Collection;

import com.cts.forcast.domain.pipeline.GetStaffingRevenueResponse;
import com.cts.forcast.domain.pipeline.InsertPipelineRequest;
import com.cts.forcast.domain.pipeline.PipelineOppRequest;
import com.cts.forcast.domain.pipeline.PipelineOppResponse;
import com.cts.forcast.domain.pipeline.StaffingPipelineRequest;

public interface PipelineService {

	public Collection<StaffingResponse> getStaffingPipeline(Integer month);
	
	public StaffingPipelineResponse insertStaffingPipeline(InsertPipelineRequest staffingRequest);
	
	public GetStaffingRevenueResponse getStaffingRevenue(Integer month);
	
	public StaffingPipelineResponse updateStaffingPiplineData(StaffingPipelineRequest pipelineRequest);
	
	public PipelineOppResponse getOpportunityPipeline(Integer month);
	
	public PipelineOppResponse insertOpportunityPipeline(PipelineOppRequest pipelineRequest);
	
	public PipelineOppResponse updateOpportunityPiplineData(PipelineOppRequest pipelineRequest);
}
