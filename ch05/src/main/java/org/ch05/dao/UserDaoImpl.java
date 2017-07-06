package org.ch05.dao;

/**
 * Created by langye on 2017/2/20.
 */
public class UserDaoImpl implements DaoInf {
@Override
public void save(String userName,int age) {
	System.out.println("insert into user_info values("+userName+";"+age+")");
	//引发异常通知
	//System.out.println(10/0);
}


@Override
public String find() {
	System.out.println("select * from user_info...");
	return "success";
}
}
