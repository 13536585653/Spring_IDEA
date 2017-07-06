package org.ch01.test;

import org.ch01.demo.Hello;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by langye on 2017/2/15.
 */
public class Main2 {
public static void main(String[] args) {
	//方法二
	//新版本，创建resource对象查找xml配置文件
	Resource resource = new ClassPathResource("applicationContext.xml");
	//创建bean工厂,取代而之的就是DefaultListableBeanFactory
	DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
	//创建xml描述定义的解析器
	BeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
	//通过这个reader加载资源配置文件,并执行解析
	reader.loadBeanDefinitions(resource);
	//通过factory的getBean方法获取容器中的对象
	Hello hello = factory.getBean(Hello.class);
	hello.say();
}
}
