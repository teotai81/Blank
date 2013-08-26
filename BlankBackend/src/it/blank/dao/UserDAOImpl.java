package it.blank.dao;

import it.blank.model.User;


public class UserDAOImpl extends CustomDAOSupport implements UserDAO {

	@Override
	public void save(User user) {
		
		getCurrentSession().save(user);
		
	}

	
	
	
}