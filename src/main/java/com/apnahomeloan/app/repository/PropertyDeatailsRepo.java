package com.apnahomeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apnahomeloan.app.model.PropertyDetails;

@Repository
public interface PropertyDeatailsRepo extends JpaRepository<PropertyDetails, Integer>{

}
