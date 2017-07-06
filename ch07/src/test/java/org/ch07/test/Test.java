package org.ch07.test;

import org.ch07.entity.Students;
import org.ch07.service.StuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangl on 2017/2/22.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StuService service = context.getBean("stuService", StuService.class);
        Students stu = service.findStuById("297e1ca75a694128015a6941a6040000");
        System.out.println(stu.getStuName());
    }
}
