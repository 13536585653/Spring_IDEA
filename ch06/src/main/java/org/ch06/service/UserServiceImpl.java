package org.ch06.service;

import org.ch06.dao.UserDao;
import org.ch06.entity.Users;

/**
 * Created by langye on 2017/2/21.
 */
public class UserServiceImpl implements UserService {
	private UserDao dao;

//提供set方法进行注入
public void setDao(UserDao dao) {
	this.dao = dao;
}

@Override
public String checkUser(Users user) {
	Users u = dao.findUser(user);
	/*String message = null;
	if(u != null && u.getPassword().equals(user.getPassword())){
		message = "登录成功!";
	}else {
		message = "用户名或密码错误！";
	}*/
	return u != null && u.getUserName().equals(user.getUserName()) && u.getPassword().equals(user.getPassword()) ?"登录成功！":"用户名或密码错误！";
}
}
