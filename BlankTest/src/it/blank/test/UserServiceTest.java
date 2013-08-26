package it.blank.test;

import it.blank.utils.SpringContextUtil;

import org.junit.Test;

public class UserServiceTest {

	@Test
	public void save() {
		SpringContextUtil.getUserService().save(null);
	}

}
