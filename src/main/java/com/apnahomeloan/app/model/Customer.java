package com.apnahomeloan.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerid;
	@NotNull
	private Integer customer_age;
	@NotNull
	private String customer_name;
	@NotNull
	private String customer_gender;
	@NotNull
	private String customer_email;
	@NotNull
	private String customer_dob;
	@NotNull
	private String customer_address;
	@NotNull
	@Size(min =10,max=13)
	private String customer_mobno;
	@NotNull
	private Double customer_proposedLoanAmt;
	@NotNull
	private Double customer_totalLoanAmt;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Applicant applicant;
	
	@OneToOne
	private AccountDetails accountDetails;
	@OneToOne
	private PropertyDetails propertyDetails;
	@OneToOne
	private Documents documents;
	@OneToOne
	private ProfessionDetails profession;
}




/*
 { "customer_age":34,
 "customer_name":"vrushali",
 "customer_gender":"female",
  "customer_email":"vk@gmail.com", 
  "customer_dob":"28/2/96",
  "customer_address":"pune",
 "customer_mobno":"9876543210",
  "customer_proposedLoanAmt":"500000", 
 "customer_totalLoanAmt":"800000",
	"applicant":{
     "applicantid":2,
      "applicant_name":"vk",
      "applicant_occupation":"developer",
      "applicant_pancard":"pancard1234",
      "applicant_email":"vk99@gamil.com",
      "cibil":{"cibilId":1,
      "cibilScore":600,
               "cibilScoreDateTime":"282222",
               "cibilStatus":"invalid",
               "cibilRemark":"bad"}
    			},
 	"accountDetails":{ "account_id":3,
    "account_type":"saving",
 						"account_holdername":"vrushalik",
 						"ifsc_code" : "sbi1234"
				},
 	"propertyDetails":{"property_ID":5,
    "property_type":"xyz",
                       "property_area":"500.00",
                       "property_price":"555555",
                       "property_address":"pune"
      				
    			},
 	
 	"profession":{"proffession_id":4,
    "designation":"junior",
                  "proffession_name":"it",
                  "proffession_type":"itt",
                  "annual_salary":600000
    }
}
  
 * 
 */