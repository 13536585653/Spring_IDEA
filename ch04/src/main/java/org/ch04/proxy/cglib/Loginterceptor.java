package org.ch04.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.ch04.proxy.util.LogUitl;

import java.lang.reflect.Method;

/**
 * Created by langye on 2017/2/17.
 */
public class Loginterceptor implements MethodInterceptor {
/** MethodInterceptor方法拦截器
 * 回调处理方法，跟InvocationHandler方法相似
 * @param o 目标对象
 * @param method 目标对象要执行的方法
 * @param args 目标对象要执行的方法所需的参数
 * @param methodProxy 目标对象的代理方法，methodProxy其实就是动态生成的子类中的方法
 * @return returnVal
 * @throws Throwable
 */
@Override
//返回处理方法，跟InvocationHandler中的invoke方法类似
public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
	//invokeSuper就是调用父类（目标对象）的方法
	Object returnVal = methodProxy.invokeSuper(o,args);
	after();
	//执行完之后可以做日志记录
	return returnVal;
}

//目标对象方法执行之后要做的事情
private void after(){
	LogUitl.log();
}
}
