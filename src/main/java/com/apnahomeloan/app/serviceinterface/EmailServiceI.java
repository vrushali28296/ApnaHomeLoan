package com.apnahomeloan.app.serviceinterface;

import org.springframework.web.multipart.MultipartFile;

import com.apnahomeloan.app.model.EmailSending;

public interface EmailServiceI 
{

	public void sendMail(EmailSending ea);

	public void sendEmailWithAttachment(EmailSending em, MultipartFile file);

}
