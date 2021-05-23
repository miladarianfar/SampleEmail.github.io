package com.email.model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Mail {

	
	private String subject;
	private String text;
	
	public Mail() {
		
	}

	public Mail(String subject, String text) {
		this.subject = subject;
		this.text = text;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
