package org.ch09.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by langye on 2017/2/24.
 * @Comnonent 标识为当前类是可以交给spring容器管理的
 * 可以通过他的参数为当前类在容器中设置一个id
 * 和<Bean id="hello"/>一样的效果。当然参数也可以不指定，
 * 那么spring容器会自动为这个类定义一个默认的id
 * 命名规范则为：就是当前类的类名，将首字母变为小写
 *
 * 还可以结合@Scope注解来指定Bean的作用域
 */
@Component("firstBean")
@Scope("prototype")

public class Hello {

	public Hello(){
		System.out.println("执行构造方法...");
	}
	/*使用@PostConstruct这个注解来定义Bean的初始化方法
	相当于<Bean init-method/>属性*/
	@PostConstruct
	public void init(){
		System.out.println("初始化Bean...");
	}

	/*使用@PreDestroy这个注解来定义Bean销毁之前要执行的方法
	相当于<Bean destroy-method/>属性
	销毁或关闭容器时调用*/
	@PreDestroy
	public void destroy(){
		System.out.println("准备销毁Bean...");
	}


	public void say(){
		System.out.println("hello spring");
	}
}
