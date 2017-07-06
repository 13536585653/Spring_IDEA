package org.train.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.train.entity.Users;
import org.train.service.BasicService;

import java.util.UUID;

/**
 * Created by langye on 2017/2/27.
 */
public class Test {

public static void main(String[] args) {
	Users users = new Users();
	users.setUid(UUID.randomUUID().toString());
	users.setUname("admin");
	users.setUpwd("123");


	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	BasicService service = context.getBean("usersService", BasicService.class);
	service.add(users);
}
}
