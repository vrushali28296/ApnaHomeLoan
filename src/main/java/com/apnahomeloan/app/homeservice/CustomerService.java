package com.apnahomeloan.app.homeservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnahomeloan.app.model.Customer;
import com.apnahomeloan.app.repository.CustomerRepositary;
import com.apnahomeloan.app.serviceinterface.CustomerServiceI;

@Service
public class CustomerService implements CustomerServiceI
{
	@Autowired
	CustomerRepositary customerRepositary;

	@Override
	public Customer saveCustomer(Customer customer) 
	{	
		return customerRepositary.save(customer);
	}

	@Override
	public List<Customer> getCustomers() 
	{
		
		return customerRepositary.findAll();
	}

	@Override
	public Customer updateCustomer(Customer c, Integer customer_id) 
	{
		Optional<Customer> cu=customerRepositary.findById(customer_id);
		if(cu.isPresent())
		{
			Customer ct=cu.get();
			ct.setCustomer_address(c.getCustomer_address());
			ct.setCustomer_age(c.getCustomer_age());
			ct.setCustomer_dob(c.getCustomer_dob());
			ct.setCustomer_email(c.getCustomer_email());
			ct.setCustomer_gender(c.getCustomer_gender());
			ct.setCustomer_mobno(c.getCustomer_mobno());
			ct.setCustomer_name(c.getCustomer_name());
//			ct.setCustomer_proposedLoanAmt(c.getCustomer_proposedLoanAmt());
//			ct.setCustomer_totalLoanAmt(c.getCustomer_totalLoanAmt());
			ct.setAccountDetails(c.getAccountDetails());
			ct.setApplicant(c.getApplicant());
			ct.setDocuments(c.getDocuments());
			ct.setProfession(c.getProfession());
			ct.setPropertyDetails(c.getPropertyDetails());
			return customerRepositary.save(ct);
		}
		return null;
	}

	@Override
	public void deleteCustomer(Integer customer_id) 
	{
		customerRepositary.deleteById(customer_id);
	}

}


//
//{ "customer_age":34,
//	 "customer_name":"vrushali",
//	 "customer_gender":"female",
//	  "customer_email":"vk@gmail.com", 
//	  "customer_dob":"28/2/96",
//	  "customer_address":"pune",
//	 "customer_mobno":"9876543210",
//	  "customer_proposedLoanAmt":"500000", 
//	 "customer_totalLoanAmt":"800000",
//		"applicant":{
//	     
//	      "applicant_name":"vk",
//	      "applicant_occupation":"developer",
//	      "applicant_pancard":"pancard1234",
//	      "applicant_email":"vk99@gamil.com",
//	      "cibil":{"cibilScore":600,
//	               "cibilScoreDateTime":"282222",
//	               "cibilStatus":"invalid",
//	               "cibilRemark":"bad"}
//	    			},
//	 	"accountDetails":{ "account_type":"saving",
//	 						"account_holdername":"vrushalik",
//	 						"ifsc_code" : "sbi1234"
//					},
//	 	"propertyDetails":{ "property_type":"xyz",
//	                       "property_area":"500.00",
//	                       "property_price":"555555",
//	                       "property_address":"pune"
//	      				
//	    			},
//	 	
//	 	"profession":{"designation":"junior",
//	                  "proffession_name":"it",
//	                  "proffession_type":"itt",
//	                  "annual_salary":600000
//	    }
//	}
	  
