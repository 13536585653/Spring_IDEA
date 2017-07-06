package org.ch04.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by langye on 2017/2/17.
 */
public class LogInterecptor implements InvocationHandler {

//定义一个目标对象(被代理的对象)，因为目标对象可以是任意被代理的对象，所以声明为object类型
private Object target;

//这个目标对象是从外部传进来的，可以通过构造方法传递
LogInterecptor(Object target){
	this.target = target;
}

//这是一个回调方法，就在这个回调方法中去调用目标对象（被代理对象）

/**
 *
 * @param proxy 动态创建出来的代理对象
 * @param method 被代理对象（目标对象）要执行的方法
 * @param args	被代理对象（目标对象）要执行的方法所需要传递的参数
 * @return	被代理对象（目标对象）执行方法的返回值
 * @throws Throwable
 */
@Override
public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	//执行目标方法之后做日志记录
	return around(method,args);
}
//目标对象方法执行之前要做的事情
private Object before(Method method,Object[] args) throws InvocationTargetException, IllegalAccessException {
	System.out.println("调用目标对象之前...");
	//回调目标对象的方法（也就是dao类里的增删查等方法）
	return method.invoke(target,args);
}
//目标对象方法执行之后要做的事情
private Object after(Method method,Object[] args) throws InvocationTargetException, IllegalAccessException {
	//回调目标对象的方法（也就是dao类里的增删查等方法）
	Object object = method.invoke(target,args);
	System.out.println("调用目标对象方法之后...");
	//LogUitl.log();
	return object;
}
//目标对象方法之前和之后要做的事情
private Object around(Method method,Object[] args) throws InvocationTargetException, IllegalAccessException {
	System.out.println("环绕执行前...");
	//回调目标对象的方法（也就是dao类里的增删查等方法）
	Object object = method.invoke(target,args);
	System.out.println("环绕执行后...");
	return object;
}
}
