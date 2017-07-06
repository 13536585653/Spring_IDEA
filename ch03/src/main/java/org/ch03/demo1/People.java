package org.ch03.demo1;

/**
 * Created by langye on 2017/2/16.
 */
public class People {
	private Tools tools;

//通过构造方法注入
public People(Tools tools){
	this.tools = tools;
}
public People(){}

//通过set方法进行注入
public void setTools(Tools tools){
	this.tools = tools;
}


	public void work(){
		tools.fix();
	}
}
