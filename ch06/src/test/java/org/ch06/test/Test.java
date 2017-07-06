package org.ch06.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by langye on 2017/2/21.
 */
public class Test {

public static void main(String[] args) throws SQLException {
	//ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	ApplicationContext context = new FileSystemXmlApplicationContext("ch06\\target\\ch06-1.0-SNAPSHOT\\WEB-INF\\classes\\applicationContext.xml");
	DataSource ds = context.getBean("dataSource",DataSource.class);
	//获取数据库连接
	System.out.println(ds.getConnection());
}
}
