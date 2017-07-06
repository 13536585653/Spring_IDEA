package org.ch04.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import org.ch04.proxy.dao.DaoImpl2;
import org.ch04.proxy.dao.DaoInf;

/**
 * Created by langye on 2017/2/17.
 * cglib实在运行时动态创建一个子类对象作为代理实例
 * 这个是和jdk动态代理最根本的区别
 */
public class Client {

public static void main(String[] args) {
	//创建一个代理生成器，类似jdk中的Proxy类
	Enhancer eh = new Enhancer();
	//设置被代理对象的Class，也就是父类的Class，
	// 他会在运行时动态生成一个代理子类对象,这个子类对象就是代理实例
	eh.setSuperclass(DaoImpl2.class);
	//设置回调处理器
	eh.setCallback(new Loginterceptor());
	//创建代理对象，返回的就是一个子类对象，可以用父类类型接收（多态）
	//父类类型子类对象，编译时看父类，运行时看子类
	DaoInf dao = (DaoImpl2) eh.create();
	dao.add();
	dao.delete();
	dao.findList();
	dao.update();
}
}
