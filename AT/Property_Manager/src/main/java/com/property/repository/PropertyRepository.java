package com.property.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.property.entity.Property;


public interface PropertyRepository extends JpaRepository<Property, Long> {
	
}