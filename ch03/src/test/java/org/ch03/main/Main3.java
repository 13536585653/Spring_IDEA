package org.ch03.main;

import org.ch03.demo2.action.UserAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by langye on 2017/2/16.
 */
public class Main3 {

public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserAction action = context.getBean("userAction",UserAction.class);
	action.add();
}
}
