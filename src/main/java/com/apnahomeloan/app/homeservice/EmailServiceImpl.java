package com.apnahomeloan.app.homeservice;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.apnahomeloan.app.model.EmailSending;
import com.apnahomeloan.app.serviceinterface.EmailServiceI;

@Service
public class EmailServiceImpl implements EmailServiceI
{

	@Autowired JavaMailSender jms;

	@Override
	public void sendMail(EmailSending ea)
	{
		try {
			SimpleMailMessage smm=new SimpleMailMessage();
			smm.setFrom(ea.getFromEmail());
			smm.setTo(ea.getToEmail());
			smm.setSubject(ea.getSubject());
			smm.setText(ea.getTextBody());
			
			jms.send(smm);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("NOT sent");
		}
		System.out.println("Sent");	
	}

	@Override
	public void sendEmailWithAttachment(EmailSending em, MultipartFile file)
	{
		MimeMessage mm=jms.createMimeMessage();
		try {
			MimeMessageHelper mmh=new MimeMessageHelper(mm,true);
			mmh.setFrom(em.getFromEmail());
			mmh.setTo(em.getToEmail());
			mmh.setSubject(em.getSubject());
			mmh.setText(em.getTextBody());		
			mmh.addAttachment(file.getOriginalFilename(), file);
			
			jms.send(mm);	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Not Sent");
		}
		System.out.println("Mail Sent");
	}
	
	
}
