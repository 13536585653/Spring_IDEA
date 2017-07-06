package org.ch11.test;

import org.ch11.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by langye on 2017/2/24.
 */
public class Test {

public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserService service = context.getBean("service",UserService.class);
	service.add();
	service.find();
}
}
