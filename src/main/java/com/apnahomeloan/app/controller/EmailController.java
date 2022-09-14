package com.apnahomeloan.app.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.apnahomeloan.app.model.EmailSending;
import com.apnahomeloan.app.serviceinterface.EmailServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;


@RestController
public class EmailController {
	

	@Autowired EmailServiceI es;
	
	@Value("${spring.mail.username}")		// using value of property
	String fromEmail;
	
	@RequestMapping(value = "/sendMail", method =  RequestMethod.POST)
	public String sendMail(@RequestBody EmailSending ea) 
	{
		ea.setFromEmail(fromEmail);
		
		try {
			es.sendMail(ea);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			return "Mail NOT Sent...";
		}
		return "Mail Sent Successfully...";
	}
	
	
	@PostMapping (value = "/sendWithAttachment", consumes = MediaType.ALL_VALUE)
	public String sendMailWithAttachment(@RequestPart(required = true, value = "attachment") MultipartFile file,
			@RequestPart("email")String email) throws IOException
	{
		
		try {
			
			EmailSending em=new EmailSending();
			em.setFromEmail(fromEmail);
			ObjectMapper o = new  ObjectMapper();
			EmailSending e2=o.readValue(email, EmailSending.class);
			em.setToEmail(e2.getToEmail());
			em.setSubject(e2.getSubject());
			em.setTextBody(e2.getTextBody());
			es.sendEmailWithAttachment(em,file);
			
			} 
				catch (Exception e) 
				{
					e.printStackTrace();
					return "Email not Sent...";
				}
		return "Mail Sent Successfully..";
	}
	
}
