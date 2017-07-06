package org.ch03.main;

import org.ch03.demo1.Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by langye on 2017/2/16.
 */
public class Main {

public static void main(String[] args) {
	//创建工厂
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	//从工厂中获取Demo对象
	Demo demo = context.getBean("demo", Demo.class);
	demo.say();
}
}
