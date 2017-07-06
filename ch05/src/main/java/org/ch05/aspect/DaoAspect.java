package org.ch05.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.ch05.utils.LogUtil;

/**
 * Created by langye on 2017/2/20.
 * 定义一个dao的切面，在切面中定义各种通知（增强）
 */
public class DaoAspect {

	//前置通知
	//JoinPoint参数表示连接点（默认可省略）
 	//可以通过连接点对象获取要传入到目标方法中的参数集
	public void daoBefore(JoinPoint jp){
		//拦截目标方法的参数，getArgs()方法返回的是一个数组
		Object[] args = jp.getArgs();
		if(args.length > 0){
			System.out.println("前置通知...拦截传递的参数："+args[0]);
		}else{
			System.out.println("前置通知...无拦截传递的参数：");
		}
	}
	//后置通知，如果目标方法在执行的过程产生异常，则不会执行后置通知
	//可以在这个通知方法自定义一个参数，用于拦截目标方法的返回值
	//（注意：必须在xml中的后置通知配置中指定returning这个属性）
	public void daoReturnAfter(String val){
		System.out.println("后置通知目标方法返回值："+val);
		LogUtil.log();
	}
	//通用的后置通知
	public void ReturnAfter(){
		System.out.println("后置通知...");
	}
	//环绕通知，必须指定ProceedingJoinPoint参数，因为通过这个参数去调用目标方法并返回相应的值
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知前...");
		//通知proceed()方法调用目标对象的行为
		//obj就是目标方法的返回值
		Object object = pjp.proceed();
		System.out.println("环绕通知后...");
		return object;
	}
	//异常通知，当目标方法执行的过程产生异常时，这个通知会被调用
	public void afterThrows(){
		System.out.println("异常通知...");
	}
	//最终通知，不管有没有参数异常，都会执行
	public void after(){
		System.out.println("最终通知...");
	}

}
