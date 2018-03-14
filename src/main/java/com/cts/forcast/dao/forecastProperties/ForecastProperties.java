package com.cts.forcast.dao.forecastProperties;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Forecast_Reports_Properties")
public class ForecastProperties implements Serializable {

	private static final long serialVersionUID = -4345246736127023802L;

	@Column(name = "Property_Id")
	@Id
	private Long propertyId;

	@Column(name = "Property_Key")
	private String propertyKey;

	@Column(name = "Property_Value")
	private String propertyValue;

	public String getPropertyKey() {
		return propertyKey;
	}

	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}

	public String getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}

	public Long getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(Long propertyId) {
		this.propertyId = propertyId;
	}

}
