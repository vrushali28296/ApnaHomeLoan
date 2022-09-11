package com.apnahomeloan.app.model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class Profession {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private Integer proffession_id;
	@NotEmpty
	private String Designation;
	@NotEmpty
	private String proffession_name;
	@NotEmpty
	private String proffession_type;
	@NotNull
	private double annual_salary;
	
}
