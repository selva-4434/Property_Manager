package com.property.transformer;

import java.util.List;

import org.springframework.stereotype.Component;

import com.property.dto.PropertyDTO;
import com.property.entity.Property;

@Component
public class PropertyTransformer {

	public List<PropertyDTO> transformToDto(List<Property> properties) {
		return properties.stream().map(property -> {
            PropertyDTO dto = new PropertyDTO();
            dto.setPropertyId(property.getId());
            dto.setPropertyName(property.getPropertyName());
            dto.setPropertyValue(property.getPropertyValue());
            return dto;
        }).toList();
	}
	

	public Property transformToEntity(PropertyDTO propertyDTO) {
		Property property = new Property();
        property.setPropertyName(propertyDTO.getPropertyName());
        property.setPropertyValue(propertyDTO.getPropertyValue());
        return property;
    }
	
	

}
