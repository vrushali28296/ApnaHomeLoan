package com.apnahomeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer employeeid;
	@NotNull
	private String employeename;

	
	@Size(min=4,max=12,message="employee username must be between 4 to 12 character and digit")
	private String employeeusername;

	@Size(min=4,max=12,message="employee password must be between 4 to 12 character and digit")
	private String employeepassword;
	@NotNull
	private String employeedesignation;
	@NotNull
	@Size(min=10,max=14)
	private String employeemobile;
	@Email
	private String employeeemailid;

    
}
