package org.test;

import org.ch09.demo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by langye on 2017/2/24.
 */
public class Test {

public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	Hello hello = context.getBean("firstBean",Hello.class);
	hello.say();
	/*Hello hello2 = context.getBean("firstBean",Hello.class);
	System.out.println(hello==hello2);*//*判断是不是单例模式*/


	/*关闭容器的方法,当scope设置为prototype时context的close和destroy这两个方法将不执行*/
	context.close();
	//context.destroy();
}
}
