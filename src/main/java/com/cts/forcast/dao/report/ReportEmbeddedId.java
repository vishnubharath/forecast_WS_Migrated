package com.cts.forcast.dao.report;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ReportEmbeddedId implements Serializable {

	@Column(name = "Associate_Id")
	private Long associateId;

	@Column(name = "Project_Id")
	private Long projectId;

	@Column(name = "Location_Type")
	private String locationType;

	public ReportEmbeddedId() {

	}

	public ReportEmbeddedId(Long associateId, Long projectId, String locationType) {
		this.associateId = associateId;
		this.projectId = projectId;
		this.locationType = locationType;
	}

	public Long getAssociateId() {
		return associateId;
	}

	public void setAssociateId(Long associateId) {
		this.associateId = associateId;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof ReportEmbeddedId))
			return false;
		ReportEmbeddedId that = (ReportEmbeddedId) o;
		return Objects.equals(getAssociateId(), that.getAssociateId())
				&& Objects.equals(getProjectId(), that.getProjectId())
				&& Objects.equals(getLocationType(), that.getLocationType());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getAssociateId(), getProjectId(), getLocationType());
	}
}
