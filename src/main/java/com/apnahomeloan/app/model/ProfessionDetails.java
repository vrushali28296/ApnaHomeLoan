package com.apnahomeloan.app.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class ProfessionDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer proffession_id;
	@NotNull
	private String designation;
	@NotEmpty
	private String proffession_name;
	@NotEmpty
	private String proffession_type;
	@NotNull
	private double annual_salary;
}
