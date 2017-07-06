package org.ch05.test;

import org.ch05.dao.DaoInf;
import org.ch05.dao.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by langye on 2017/2/20.
 */
public class Test {

public static void main(String[] args) {
	//创建并初始化容器工厂
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	//这时返回的dao实现类对象是动态产生的代理对象，由spring自动完成
	DaoInf dao = context.getBean("userDao", UserDaoImpl.class);
	dao.save("langYe",22);
	System.out.println("--------------------------------------");
	System.out.println();
	dao.find();
}
}
