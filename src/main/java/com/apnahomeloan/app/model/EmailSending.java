package com.apnahomeloan.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EmailSending 
{
	@Id
	private Integer emailId;
	private String toEmail;
	private String fromEmail;
	private String subject;
	private String textBody;
}
