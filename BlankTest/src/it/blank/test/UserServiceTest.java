package it.blank.test;

import it.blank.model.User;
import it.blank.utils.SpringContextUtil;

import org.junit.Test;

public class UserServiceTest {

	@Test
	public void save() {
		User user = new User();
		
		user.setUsername("user@gmail.com");
		user.setPassword("password");
		SpringContextUtil.getUserService().save(user);
	}

}
