package it.blank.dao;

import org.apache.log4j.Logger;

import it.blank.model.User;


public class UserDAOImpl extends CustomDAOSupport implements UserDAO {

	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	public void save(User user) {
		log.info("Calling save");
		
		getCurrentSession().save(user);
		
	}

	
	
	
}