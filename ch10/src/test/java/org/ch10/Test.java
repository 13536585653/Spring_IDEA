package org.ch10;

import org.ch10.action.UserAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by langye on 2017/2/24.
 */
public class Test {

public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	/*这里的action字符串对应UserAction类中的Component的注解action*/
	UserAction action =  context.getBean("action",UserAction.class);
	action.add();
}
}
