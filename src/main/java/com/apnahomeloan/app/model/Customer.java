package com.apnahomeloan.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
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
//	@OneToOne
//	private AccountDetails accountDetails;
//	@OneToOne
//	private PropertyDetails propertyDetails;
//	@OneToOne
//	private Documents documents;
//	@OneToOne
//	private Profession profession;
}




/*
 * { "customer_age":30, "customer_name":"vrushali", "customer_gender":"female",
 * "customer_emailid":"vk@gmail.com", "customer_dob":"28/2/96",
 * "customer_address":"pune", "customer_mobno":"987654321",
 * "customer_proposedLoanAmt":"500000", "customer_totalLoanAmt":"800000" }
 * 
 * 
 */