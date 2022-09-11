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
	private Integer empid;
	@NotNull(message = "firstName is requred")
	@Pattern(regexp = "^[a-z A-Z]{6,20}$",message = "Emp Name must be between 6 to 20 character")
	private String empname;

	@NotNull
	@Size(min=4,max=12,message="empusername must be between 4 to 12 character and digit")
	private String empusername;
	@NotNull
	@Size(min=4,max=12,message="emppassword must be between 4 to 12 character and digit")
	private String emppassword;
	@NotNull
	@Pattern(regexp = "^[a-z A-Z]{4,12}$",message="lastName should be 4to 10")
	private String empdesignation;
	@NotNull
	@Size(min=10,max=13)
	private long empmob;
	@Email
	private String empemailid;

    
}
