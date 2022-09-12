package com.apnahomeloan.app.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Cibil {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	private Integer csid;
	@NotNull

	private Integer csscore;
	@NotNull
	private String csdatetime;
	@NotNull
	private String csstatus;
	@NotNull
	private String csremark;
	}
