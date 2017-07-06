package org.ch13.test;

import org.ch13.AppConfig;
import org.ch13.entity.Students;
import org.ch13.service.StuService;
import org.ch13.service2.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.UUID;

/**
 * Created by langye on 2017/2/28.
 */
public class Test {

public static void main(String[] args) {
	/*由于使用的是注解配置类，不是xml配置文件，
	* 那么就不能使用ClassPathXMLApplicationContext，
	* 因为他是解释xml配置文件的工厂
	* 那么就需要更换为AnnotationConfigApplicationContext
	* 构造方法传入一个配置类的class*/
	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	UserService service = context.getBean("userService",UserService.class);
	service.add();
	UserService service2= context.getBean("userService",UserService.class);
	System.out.println(service==service2);

	System.out.println("******************************************");
	StuService stuService = context.getBean("stuService",StuService.class);
	Students s = new Students();
	s.setSid(UUID.randomUUID().toString());
	s.setStuName("wangZai");
	s.setAge(22);
	stuService.add(s);
}
}
