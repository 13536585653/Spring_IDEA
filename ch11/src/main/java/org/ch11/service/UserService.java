package org.ch11.service;

import org.springframework.stereotype.Component;

/**
 * Created by langye on 2017/2/24.
 */
@Component("service")
public class UserService {

	/*add、find这两个方法其实就是被代理的连接点*/
	public void add(){
		System.out.println("添加业务...");
	}

	public String find(){
		System.out.println("查找业务...");
		return "success";
	}
}
