package org.ch03.demo2.action;

import org.ch03.demo2.service.UserServiceInf;

/**
 * Created by langye on 2017/2/16.
 */
public class UserAction {
	private UserServiceInf service;

	//通过set方法注入实现类
	public void setService(UserServiceInf service){
		this.service = service;
	}
	public void add(){
		service.save();
	}
}
