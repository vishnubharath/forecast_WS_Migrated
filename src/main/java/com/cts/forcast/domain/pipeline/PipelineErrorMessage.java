package com.cts.forcast.domain.pipeline;

import org.springframework.stereotype.Component;

@Component
public class PipelineErrorMessage {
	
	public PipelineErrorMessage() {
		// TODO Auto-generated constructor stub
	}
	
	public PipelineErrorMessage(String errorMessage) {
		super();		
		this.errorMessage = errorMessage;
	}

	private Integer errorCode;
	private String errorMessage;

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
