package org.ch01.test;

import org.ch01.demo.Hello;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by langye on 2017/2/15.
 */
public class Main {

public static void main(String[] args) {
	//方法一
	//通过ClassPathResource从classpath下查找applicationContext.xml的配置文件。
	Resource resource = new ClassPathResource("applicationContext.xml");
	//创建要给Bean工厂，通过resource对象来初始化所有的Bean信息
	BeanFactory factory = new XmlBeanFactory(resource);
	//通过getBean的方法从容器工厂中获取bean实例
	Hello hello = factory.getBean(Hello.class);
	//调用对象的方法
	hello.say();
}
}
