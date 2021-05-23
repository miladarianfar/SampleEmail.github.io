package com.email.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.email.model.MAIL_USER;
import com.email.model.Mail;
import com.email.model.User;

@SessionScoped
@ManagedBean
public class MailController {

	private List<User> users = new ArrayList<User>();
	private List<MAIL_USER> mail_user = new ArrayList<MAIL_USER>();
	private List<MAIL_USER> mails = new ArrayList<MAIL_USER>();
	private List<MAIL_USER> received_mail = new ArrayList<MAIL_USER>();
	User receiver;
	
	
	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public List<MAIL_USER> getMail_user() {
		return mail_user;
	}

	public void setMail_user(List<MAIL_USER> mail_user) {
		this.mail_user = mail_user;
	}

	public List<MAIL_USER> getMails() {
		return mails;
	}

	public void setMails(List<MAIL_USER> mails) {
		this.mails = mails;
	}

	@PostConstruct
	public void init() {
		
		User u1 = new User(1, "milad", "arianfar", "milad@gmail.com");
		User u2 = new User(2, "hassan", "zamani", "hassan@gmail.com");
		User u3 = new User(3, "mary", "public", "mary@gmail.com");
		User u4 = new User(4, "john", "doe", "john@gmail.com");
		User u5 = new User(5, "chad", "darbi", "chad@gmail.com");
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		
	}
	
	public String sendMail(User sender, User user, Mail mail) {
		
		for(User u : users) {
			if(u.getEmail().equals(user.getEmail())) {
				receiver = u;
			}
		}
		
		MAIL_USER myMail = new MAIL_USER(sender, receiver, mail);
		
		mail_user.add(myMail);
		
		return "";
	}
	
	public String getMails(User sender) {
		
		String check ="";
		
		for(MAIL_USER mu : mail_user) {
			if(mu.getSender().getEmail().equals(sender.getEmail())) {
				mails.add(mu);
				check = "sent_mail";
			} else {
				check = "";
			}
		}
		
		return check;
	}
	
	public String getReceivedMails(User sender) {
		
		String check ="";
		
		for(MAIL_USER mu : mail_user) {
			
			if(mu.getReciever().getEmail().equals(sender.getEmail())) {
				received_mail.add(mu);
				check = "received_mail";
			}
			
		}
		
		return check;
		
	}
	
}























