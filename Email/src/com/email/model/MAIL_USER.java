package com.email.model;

import java.util.List;

public class MAIL_USER {

	
	private int id;
	private User sender;
	private User reciever;
	private Mail mail;
	
	public MAIL_USER() {
		
	}

	
	
	public MAIL_USER(User sender, User reciever, Mail mail) {
		this.sender = sender;
		this.reciever = reciever;
		this.mail = mail;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public Mail getMail() {
		return mail;
	}

	public void setMail(Mail mail) {
		this.mail = mail;
	}

	public User getReciever() {
		return reciever;
	}

	public void setReciever(User reciever) {
		this.reciever = reciever;
	}
	
	
}
