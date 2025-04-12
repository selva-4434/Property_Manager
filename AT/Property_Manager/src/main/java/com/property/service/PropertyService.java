package com.property.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.property.dto.PropertyDTO;
import com.property.entity.Property;
import com.property.repository.PropertyRepository;
import com.property.transformer.PropertyTransformer;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository repository;

    @Autowired
    private PropertyTransformer transformer;

    public List<PropertyDTO> getAllProperties() {
        return transformer.transformToDto(repository.findAll());
    }

    public void saveProperty(PropertyDTO propertyDTO) {
        Property property = transformer.transformToEntity(propertyDTO);
        repository.save(property);
    }

    public void deleteAllProperties() {
        repository.deleteAll();
    }
}