package org.ch01.test;

import org.ch01.demo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by langye on 2017/2/15.
 */
public class Main3 {

public static void main(String[] args) {
	//方法三
	//使用applicationContext构建容器工厂，他是继承自BeanFaction
	//区别在于：
	// ApplicationContext在BeanFactory基础之上做了许多而外的功能增强
	//还用一个核心的区别就是:BeanFactory是延迟创建的
	//而ApplicationContext是预先创建的
	//意思就是，当使用BeanFactory的时候，只有在调用getBean方法时
	//，才会创建一个Bean实例放入容器
	//而applicationContext是在容器初始化的时候就会预先创建好在容器中

	//使用ClassPathXmlApplicationContext，从classpath中查找对应的配置文件
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	//FileSystemXmlApplicationContext，它是从文件系统路径中查找（绝对路径）
	//获取项目的绝对路径
	System.out.println(System.getProperty("user.dir"));
	//ApplicationContext context = new FileSystemXmlApplicationContext("ch01\\target\\classes\\applicationContext.xml");

	//还其他的实现...
	Hello hello = context.getBean(Hello.class);
	hello.say();
}
}
