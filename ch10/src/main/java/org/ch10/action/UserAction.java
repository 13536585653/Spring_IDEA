package org.ch10.action;

import org.ch10.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by langye on 2017/2/24.
 *
 * spring在3.0之后提供了更丰富的类注解来标识Bean对象，
 * 取代@Component,使用这些注解可以更明确的认知Bean的作用 action相当于Bean的id
 *
 * 不同的注解标识不同层面的Bean，比如：
 * 控制层（controller）可以使用@Controller注解，来标识控制器；
 * 业务层（service2）可以使用@Service来注解，标识业务层组件；
 * dao层（dao）可以使用@Repository注解，标识仓储（持久层）组件
 *
 *  spring的注解有两种方式：
 * 1、使用java JSR-250的标准注解@Resource进行注入
 * 		@Resource 注解可以标识在属性以及set方法上，但不能用于构造方法
 * 当某个接口只有一个实现类的时候，直接使用@Resource注解即可，因为
 * spring会检查到该接口只有一个实现类，就自动注入进来。如果有多个实现类
 * 的时候，那么这个时候就需要指定name属性或者是type属性，告诉spring容器
 * 需要注入的是哪个实现类。name的值对应是其他组件标识的id，跟配置文件中
 * <property/>的ref属性用法一样。而type属性指定的是某个实现类的class
 *
 * 2、使用spring自带的注解@Autowired进行注入
 * 		@Autowired 注解可以标识在属性、set方法以及构造方法上都可以。
 * 		它里面的required属性表示必须要有相应的对象注入，默认值为true，设置
 * 		为false的话表示可以为空，spring将忽略
 * 		@Autowired 通常会结合另外一个注解一起使用，就是@Qualifier,
 * 		使用这个标识具体要注入哪个对象
 * 		@Qualifier 注解可以标识在属性上、set方法、以及方法的参数上,
 * 不能标识在构造方法上，但是可以标识在构造方法的参数上。
 */
@Component("action")
@Scope("prototype")
public class UserAction {



	/*注入方法1、属性注入可以省略set方法*/
	/*@Autowired
	@Qualifier("userService2")*/

	/*方法2、
	* @Resource
@Resource(name = "userService2")*/
private UserService service;
/*方法3、*/
@Autowired(required = false)
public void setService(@Qualifier("userService2")UserService service) {
	this.service = service;
}

/*将@Qualifier标识在构造方法的参数上*/
/*@Autowired
public UserAction(@Qualifier("userService1")UserService service2) {
	this.service2 = service2;
}*/


public void add(){
	service.save();
}
}
