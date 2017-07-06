package org.ch02.test;

import org.ch02.service.UserServiceImp;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by langye on 2017/2/15.
 */
public class Main {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	//根据配置文件中指定的id，从容器中获取bean实例
	//spring3.0之后getBean方法提供了泛型的支持
	UserServiceImp serviceImp = context.getBean("imp1",UserServiceImp.class);
	serviceImp.save();

	//使用BeanFactory从容器中移除Bean对象，同时会调用指定的destroy方法
	/*DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
	BeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	reader.loadBeanDefinitions(new ClassPathResource("applicationContext.xml"));
	UserServiceImp s = context.getBean("imp1", UserServiceImp.class);
	s.save();
	factory.destroyBean("imp1",s);*/
	//ClassPathXmlApplicationContext关闭容器(close)或销毁（destroy）的时候。
	/*context.destroy();
	context.close();*/
}
}
