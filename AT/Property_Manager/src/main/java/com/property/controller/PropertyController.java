package com.property.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.property.dto.PropertyDTO;
import com.property.service.PropertyService;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping("/all")
    public List<PropertyDTO> getAllProperties() {
        return propertyService.getAllProperties();
    }

    @PostMapping("/save")
    public ResponseEntity<String> saveProperty( @RequestBody PropertyDTO propertyDTO) {
        propertyService.saveProperty(propertyDTO);
        return ResponseEntity.ok("Property saved successfully");
    }


    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteAllProperties() {
        propertyService.deleteAllProperties();
        return ResponseEntity.ok("All properties deleted successfully");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateProperty(@RequestBody PropertyDTO propertyDTO) {
    	propertyService.saveProperty(propertyDTO);
        return ResponseEntity.ok("Property updated successfully");
    }
}
     

