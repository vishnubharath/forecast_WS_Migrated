package com.cts.forcast.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.forcast.dao.pipeline.PipelineDao;
import com.cts.forcast.dao.pipeline.StaffingDao;
import com.cts.forcast.domain.pipeline.GetStaffingRevenueResponse;
import com.cts.forcast.domain.pipeline.InsertPipelineRequest;
import com.cts.forcast.domain.pipeline.PipelineErrorMessage;
import com.cts.forcast.domain.pipeline.PipelineOppRequest;
import com.cts.forcast.domain.pipeline.PipelineOppResponse;
import com.cts.forcast.domain.pipeline.PipelineOppVO;
import com.cts.forcast.domain.pipeline.StaffingForUIVO;
import com.cts.forcast.domain.pipeline.StaffingPipelineRequest;
import com.cts.forcast.domain.pipeline.StaffingPipelineResponse;
import com.cts.forcast.domain.pipeline.StaffingPipelineVO;
import com.cts.forcast.domain.pipeline.StaffingResponse;
import com.cts.forcast.service.PipelineService;
import com.cts.forcast.service.Util.PipelineUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service("pipelineService")
public class PipelineServiceImpl implements PipelineService {

	//@Autowired
	PipelineDao pipelineDao;

	//@Autowired
	StaffingDao staffingDao;

	@Autowired
	GetStaffingRevenueResponse getStaffingRevenueResponse;
	
	public Collection<StaffingResponse> getStaffingPipeline(Integer month) {
		String staffingValue = ""; // VBJ staffingDao.getStaffingPipeline(month);
		ObjectMapper mapper = new ObjectMapper();
		StaffingPipelineVO[] staffingData = null;
		try {
			staffingData = mapper.readValue(staffingValue, StaffingPipelineVO[].class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Collection<StaffingResponse> response = new ArrayList<StaffingResponse>();
		for (int i = 0; i < staffingData.length; i++) {
			StaffingResponse staffingResponse = new StaffingResponse();
			StaffingPipelineVO voData = staffingData[i];
			staffingResponse.setsNo(voData.getsNo());
			staffingResponse.setName(voData.getName());
			staffingResponse.setDivision(voData.getDivision());
			staffingResponse.setNoOfResources(voData.getNoOfResources());
			Double[] values = PipelineUtil.getValueSet(voData.getCostData());			
			staffingResponse.setAmount(voData.getAmount());
			staffingResponse.setHeaders(PipelineUtil.getKeySet(voData.getCostData()));
			staffingResponse.setValues(values);
			response.add(staffingResponse);
		}
		return response;
	}

	
	public StaffingPipelineResponse insertStaffingPipeline(InsertPipelineRequest pipelineRequest) {
		ObjectMapper mapper = new ObjectMapper();
		System.out.println(pipelineRequest);
		Integer yearMonth = pipelineRequest.getMonth();
		System.out.println(yearMonth);
		List<StaffingForUIVO> staffingUIVOList = pipelineRequest.getStaffingList();
		System.out.println(staffingUIVOList);		
		List<StaffingPipelineVO> staffingPipelineVOList = PipelineUtil.convertStaffingPipelineVO(staffingUIVOList);
		
		String staffingData = null;
		try {
			staffingData = mapper.writeValueAsString(staffingPipelineVOList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		Double totalAmount = PipelineUtil.getTotalStaffingAmount(staffingPipelineVOList);
		// VBJ staffingDao.insertStaffingPipeline(yearMonth, staffingData, totalAmount);
		PipelineErrorMessage errorMessage = new PipelineErrorMessage("SUCCESS");
		StaffingPipelineResponse response = new StaffingPipelineResponse();
		response.setErrorMessage(errorMessage);
		return response;
	}

	public GetStaffingRevenueResponse getStaffingRevenue(Integer month){
		getStaffingRevenueResponse.setTotalStaffingRevenue(null /*staffingDao.getStaffingRevenue(month)*/);
		return getStaffingRevenueResponse;
	}
	
	public StaffingPipelineResponse updateStaffingPiplineData(StaffingPipelineRequest pipelineRequest) {
		return null;
	}

	public PipelineOppResponse getOpportunityPipeline(Integer month) {
		String opportunityValue = ""; // VBJ pipelineDao.getOpportunityPipeline(month);
		ObjectMapper mapper = new ObjectMapper();
		PipelineOppVO[] opportunityData = null;
		try {
			opportunityData = mapper.readValue(opportunityValue, PipelineOppVO[].class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		PipelineOppResponse oppResponse = new PipelineOppResponse();
		List<PipelineOppVO> list = new ArrayList<PipelineOppVO>();
		for (int i = 0; i < opportunityData.length; i++) {
			list.add(opportunityData[i]);		
		}
		oppResponse.setOppList(list);
		PipelineErrorMessage errorMessage = new PipelineErrorMessage("Success");
		errorMessage.setErrorCode(200);
		oppResponse.setErrorMessage(errorMessage);
		return oppResponse;
		
	}

	public PipelineOppResponse insertOpportunityPipeline(PipelineOppRequest pipelineRequest) {
		ObjectMapper mapper = new ObjectMapper();
		Integer yearMonth = pipelineRequest.getMonth();
		List<PipelineOppVO> oppPipelineVOList = pipelineRequest.getOppList();
		String opportunityData = null;
		try {
			opportunityData = mapper.writeValueAsString(oppPipelineVOList);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		//VBJ pipelineDao.insertOpportunityPipeline(yearMonth, opportunityData);
		PipelineErrorMessage errorMessage = new PipelineErrorMessage("SUCCESS");
		PipelineOppResponse response = new PipelineOppResponse();
		response.setErrorMessage(errorMessage);
		return response;
		
	}

	
	
	public PipelineOppResponse updateOpportunityPiplineData(PipelineOppRequest pipelineRequest) {
		
		return null;
	}

}
