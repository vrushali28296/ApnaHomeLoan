package com.apnahomeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class EmiDetails 
{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer emiId;
	private Double emiAmtMonnthly;
	private String emiDueDate;
	private String previousEmiStatus;
}
