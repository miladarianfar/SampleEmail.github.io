package com.email.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.email.model.User;

@SessionScoped
@ManagedBean
public class LoginController {

	
	FacesContext context;
	private List<User> users = new ArrayList<User>();

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
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
	
	public String checkUser(User user) {
		
		String check = "";
		
		for(User u : users) {
			if(u.getEmail().equals(user.getEmail()) && !user.getEmail().equals("")) {
				check = "welcome";
				context.getCurrentInstance().getExternalContext().getSessionMap().put("myUser", user);
				break;
			} else {
				check = "";
			}
		}
		
		return check;
		
	}
	
	public String logout() {
		
		context.getCurrentInstance().getExternalContext().invalidateSession();
		
		return "login";
	}
	
}












