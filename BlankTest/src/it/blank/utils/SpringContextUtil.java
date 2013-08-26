package it.blank.utils;

import it.blank.service.UserService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextUtil {

	private static ClassPathXmlApplicationContext ctx;
	static {
		ctx = new ClassPathXmlApplicationContext("config/spring-context.xml");
	}
	
	
	public static UserService getUserService() {
		return (UserService) ctx.getBean("userService");
	}
	
	
}
