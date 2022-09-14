package com.apnahomeloan.app.serviceinterface;

import java.util.List;

import javax.validation.Valid;

import com.apnahomeloan.app.model.PropertyDetails;

public interface PropertyDetailsServiceI {

public	PropertyDetails savePropertyDetails(@Valid PropertyDetails propertydetails);

public List<PropertyDetails> getpropertydetails();

public PropertyDetails updatepropertydetails(PropertyDetails propertydetails, Integer propertyID);

public void deletepropertydetails(Integer propertyID);

}
