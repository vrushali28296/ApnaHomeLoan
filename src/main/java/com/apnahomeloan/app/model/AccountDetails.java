package com.apnahomeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class AccountDetails {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private Integer account_id;
	@NotNull
	private String account_type;
	@NotNull
	private String account_holdername;
	@NotNull
	private String ifsc_code;
}
