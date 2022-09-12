package com.apnahomeloan.app.homeservice;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnahomeloan.app.model.PropertyDetails;
import com.apnahomeloan.app.repository.PropertyDeatailsRepo;
import com.apnahomeloan.app.serviceinterface.PropertyDetailsServiceI;

@Service
public class PropertyDetailsHomeService implements PropertyDetailsServiceI {
	
	@Autowired
	PropertyDeatailsRepo propertydetailstrepository;
	

	@Override
	public PropertyDetails savePropertyDetails(@Valid PropertyDetails propertydetails) {
		
		
		return propertydetailstrepository.save(propertydetails);
		
	}


	@Override
	public List<PropertyDetails> getpropertydetails() {
		
		return propertydetailstrepository.findAll();
	}


	@Override
	public PropertyDetails updatepropertydetails(PropertyDetails propertydetails, Integer property_ID) {
		
		return propertydetailstrepository.save(propertydetails);
	}


	@Override
	public void deletepropertydetails(Integer property_ID) {
		propertydetailstrepository.deleteById(property_ID);
		
	}

}
