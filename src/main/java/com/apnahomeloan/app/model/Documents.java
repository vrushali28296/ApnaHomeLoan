package com.apnahomeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Documents {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Integer documentId;
	@Lob
	private byte[] addressProof;
	
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] aadharcard;
	@Lob
	
	private byte[] signature;
	@Lob
	private byte[] photo;
	
	@Lob
	private byte[] incometax;
	
	@Lob
	private byte[] salaryslip;
	@Lob
	private byte[] bankcheck;
	
	
}
