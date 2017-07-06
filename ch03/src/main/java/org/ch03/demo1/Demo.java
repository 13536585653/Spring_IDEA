package org.ch03.demo1;

/**
 * Created by langye on 2017/2/16.
 */
public class Demo {

	private String userName;
	private int age;


//通过set方法注入userName
public void setUserName(String userName) {
	this.userName = userName;
}

//通过set方法注入age
public void setAge(int age) {
	this.age = age;
}

public Demo(){}
//构造方法注入
public Demo(String userName,int age){
	this.age = age;
	this.userName = userName;
}

//say方法
public void say(){
	System.out.println("用户名："+userName);
	System.out.println("年龄："+age);
}
}
