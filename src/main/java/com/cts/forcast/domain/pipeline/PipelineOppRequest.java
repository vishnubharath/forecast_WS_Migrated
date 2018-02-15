package com.cts.forcast.domain.pipeline;

import java.util.List;

public class PipelineOppRequest {
	
	private Integer month;
	private List<PipelineOppVO> OppList;
	

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public List<PipelineOppVO> getOppList() {
		return OppList;
	}

	public void setOppList(List<PipelineOppVO> oppList) {
		OppList = oppList;
	}

	
	

}
