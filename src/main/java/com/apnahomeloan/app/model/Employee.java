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
	private Integer employee_id;
	@NotNull(message = "firstName is requred")
	@Pattern(regexp = "^[a-z A-Z]{6,20}$",message = "Employee Name must be between 6 to 20 character")
	private String employee_name;

	@NotNull
	@Size(min=4,max=12,message="employee username must be between 4 to 12 character and digit")
	private String employee_username;
	@NotNull
	@Size(min=4,max=12,message="employee password must be between 4 to 12 character and digit")
	private String employee_password;
	@NotNull
	@Pattern(regexp = "^[a-z A-Z]{4,12}$",message="designation should be 4to 10")
	private String employee_designation;
	@NotNull
	@Size(min=10,max=14)
	private String employee_mobile;
	@Email
	private String employee_emailid;

    
}
