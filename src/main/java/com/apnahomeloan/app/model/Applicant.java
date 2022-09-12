package com.apnahomeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Applicant {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer apid;
  @NotNull
	private String apname;
  @NotNull
	private String apaddress;
  @Size(min =10,max=13)
	private String apmobno;
 @NotNull
	private String apoccupation;
  @Size(min =10,max=12)
	private String appancard;
  @Email
	private String apemail;
	
}
