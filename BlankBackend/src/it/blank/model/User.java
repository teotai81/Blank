package it.blank.model;

import javax.persistence.Entity;

@Entity
public class User extends Persistence {

	private static final long serialVersionUID = 6648673567096663795L;

	private String username;
	
	private String password;

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
