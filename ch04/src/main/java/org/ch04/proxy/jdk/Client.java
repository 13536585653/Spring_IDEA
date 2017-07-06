package org.ch04.proxy.jdk;

import org.ch04.proxy.dao.DaoImpl2;
import org.ch04.proxy.dao.DaoInf;

import java.lang.reflect.Proxy;


/**
 * Created by langye on 2017/2/17.
 */
public class Client {

public static void main(String[] args) {
	//创建一个目标对象（被代理的对象）
	DaoImpl2 dao = new DaoImpl2();
	//创建一个回调处理器(通过构造方法传值)
	LogInterecptor handler = new LogInterecptor(dao);
	//通过Proxy类newProxyInstance动态创建代理对象
	//动态创建的这个代理对象同样实现了目标对象所实现的接口
	//参数一：类加载器实例
	//参数二：目标对象实现的所有接口（是一个数组）
	//参数三：回调处理器
	DaoInf daoProxy = (DaoInf) Proxy.newProxyInstance(Client.class.getClassLoader(),DaoImpl2.class.getInterfaces(),handler);
	daoProxy.add();
	daoProxy.delete();
	daoProxy.findList();
	daoProxy.update();
}
}
