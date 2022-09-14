package com.apnahomeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Ledger {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ledgerId;
	private String ledgerStartDate;
	private String ledgerEndDate;
	private Double RemainingAmt;
	
	@OneToOne
	private EmiDetails emidetails;


}
