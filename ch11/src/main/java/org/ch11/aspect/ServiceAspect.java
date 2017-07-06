package org.ch11.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by langye on 2017/2/24.
 * 使用@Aspect注解标识的类为一个切面
 * 可以在这个类中定义各种通知以及切入点
 * 每一种通知都有对应的注解标识
 */
@Aspect
@Component
public class ServiceAspect {
	/*定义切入点*/
	@Pointcut("execution(* org.ch11.service.UserService.*(..))")
	public void pointcut(){
		/*这是一个空方法*/
	}

	/*引用上面的切入点*/
	@Before("pointcut()")
	public void before(){
		System.out.println("前置通知...");
	}

	/*returning属性用于接收目标方法返回值，参数名称必须和通知方法中的参数对应*/
	@AfterReturning(value = "pointcut()",returning = "val")
	public void returnAfter(String val){
		System.out.println("后置通知，目标方法返回值..."+val);
	}

	@Around("pointcut()")
	public Object around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("环绕通知前...");
		Object object = pjp.proceed();
		System.out.println("环绕通知后...");
		return object;
	}

	@AfterThrowing("pointcut()")
	public void afterThrowing(){
		System.out.println("异常通知...");
	}

	@After("pointcut()")
	public void after(){
		System.out.println("最终通知...");
	}
}
