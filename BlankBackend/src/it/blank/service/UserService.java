package it.blank.service;

import it.blank.dao.UserDAO;
import it.blank.model.User;

public class UserService {

	private UserDAO userDAO;

	
	public void save(User user) {
		System.out.println("Calling save");
		
//		userDAO.save(user);
	}
	
	
	
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
