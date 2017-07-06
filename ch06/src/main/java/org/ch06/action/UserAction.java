package org.ch06.action;

import org.ch06.entity.Users;
import org.ch06.service.UserService;

/**
 * Created by langye on 2017/2/21.
 */
public class UserAction {
	private Users user;
	//定义一个UserService接口，让spring注入一个实现类
	private UserService service;
	private String message;
//通过set方法进行注入
public void setService(UserService service) {
	this.service = service;
}

public Users getUser() {
	return user;
}

public void setUser(Users user) {
	this.user = user;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String login(){
	message = service.checkUser(user);
	return "success";
}
}
