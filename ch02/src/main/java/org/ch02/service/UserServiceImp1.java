package org.ch02.service;

/**
 * Created by langye on 2017/2/15.
 */
public class UserServiceImp1 implements UserServiceImp {
	//构造方法
	public UserServiceImp1(){
		System.out.println("执行构造方法...");
	}

	//初始化方法
	public void init(){
		System.out.println("初始化...");
	}

	//抽象的save方法
	@Override
	public void save() {
	System.out.println("hello Imp1...");
}

	//销毁方法
	public void destroy(){
		System.out.println("销毁...");
	}
}
