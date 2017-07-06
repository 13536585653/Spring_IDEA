package org.ch02.test;

import org.ch02.service.UserServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by langye on 2017/2/15.
 */
public class Main2 {

public static void main(String[] args) {
	//测试容器的scope为singleton
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserServiceImp s1 = context.getBean("imp1",UserServiceImp.class);
	UserServiceImp s2 = context.getBean("imp1",UserServiceImp.class);
	System.out.println(s1==s2);
}
}
