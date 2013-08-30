package it.blank.service;

import org.apache.log4j.Logger;

import it.blank.dao.UserDAO;
import it.blank.model.User;

public class UserService {

	private UserDAO userDAO;
	
	private Logger log = Logger.getLogger(this.getClass());

	
	public void save(User user) {
		log.info("Calling save");
		
		userDAO.save(user);
	}
	
	
	
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
}
