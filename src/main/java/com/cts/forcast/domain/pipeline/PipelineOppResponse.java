package com.cts.forcast.domain.pipeline;

import java.util.List;

public class PipelineOppResponse {
	
	PipelineErrorMessage errorMessage;
	List<PipelineOppVO> oppList;

	public List<PipelineOppVO> getOppList() {
		return oppList;
	}

	public void setOppList(List<PipelineOppVO> oppList) {
		this.oppList = oppList;
	}

	public PipelineErrorMessage getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(PipelineErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}

	
	

}
