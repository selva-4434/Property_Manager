package com.property.dto;

import lombok.Data;

@Data
public class PropertyDTO {
	
	private String propertyName;
	private String propertyValue;
	private Long propertyId;

	public PropertyDTO() {
    }
	
	public PropertyDTO(String propertyName, String propertyValue, Long propertyId) {
		this.propertyName = propertyName;
        this.propertyValue = propertyValue;
        this.propertyId = propertyId;
    }
	
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
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
