package org.ch03.main;

import org.ch03.demo1.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by langye on 2017/2/16.
 */
public class Main2 {

public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	People people = context.getBean("people",People.class);
	people.work();
}
}
