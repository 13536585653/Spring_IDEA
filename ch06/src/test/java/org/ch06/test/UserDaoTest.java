package org.ch06.test;

import org.ch06.dao.UserDao;
import org.ch06.entity.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by langye on 2017/2/21.
 */
public class UserDaoTest {

	/**************************用户******************************/
	private final static String UID = "95796732-b1f0-49a1-bbb8-b55c8a1be67b";

	//添加
	private static Users save(){
		Users users = new Users();
		users.setUid(UUID.randomUUID().toString());
		users.setUserName("hello");
		users.setPassword("123");

		System.out.println("成功插入："+context().save(users)+"条");
		return users;
	}
	//删除
	private static void delete(){
		int count = context().delete(UID);
		System.out.println("删除条数："+count);
	}
	//根据id查询用户名
	private static void findUserFromId(){
		String userName = context().findUserFromId(UID);
		System.out.println("用户名："+userName);
	}
	//根据id查询用户名
	private static void findUserById(){
		Users user = context().findUserById(UID);
		System.out.println("ID："+user.getUid());
		System.out.println("用户名："+user.getUserName());
		System.out.println("密码："+user.getPassword());
	}
	//根据用户来查询用户信息（一般用于登录验证）
	private static void findUser(){
		Users users = new Users();
		users.setUserName("test");
		users.setPassword("test");
		Users user = context().findUser(users);
		System.out.println("用户名："+user.getUserName());
	}
	//根据用户名来查询用户
	private static void findUserByName(){
		Users user = context().findUserByName("wangZai");
		System.out.println("ID："+user.getUid());
		System.out.println("用户名："+user.getUserName());
		System.out.println("密码："+user.getPassword());
	}
	//查询列表
	private static void findUsers(){
		List<Users> list = context().findUsers();
		for(Users user : list){
			System.out.println("用户名："+user.getUserName());
		}
	}
	//更新
	private static void update(){
		Users user = context().findUserById(UID);
		user.setUserName("hello");
		user.setPassword("hello");
		int count = context().update(user);
		System.out.println("更新条数："+count);
	}
	//查询总记录数
	private static void count(){
		int count = context().count();
		System.out.println("记录条数："+count);
	}

	/***********************地址*****************************/
	//连表查询，返回多条记录
	private static void findUserJoinAddrs(){
		List<Map<String,Object>> list = context().findUserJoinAddr(UID);
		for(Map<String,Object> map : list){
			for (String key : map.keySet()){
				System.out.println("key :"+key);
				System.out.println("值 :"+map.get(key));
			}
		}
	}
	//连表查询，返回一条记录
	private static void findUserJoinAddr(){
		Map<String,Object> map = context().findUserJoinAddr(UID,"zhuHai");
		for (String key : map.keySet()){
			System.out.println("key :"+key);
			System.out.println("值 :"+map.get(key));
		}
	}
//容器方法
private static UserDao context(){
	ApplicationContext context = new FileSystemXmlApplicationContext("ch06\\target\\ch06-1.0-SNAPSHOT\\WEB-INF\\applicationContext.xml");
	return context.getBean("userDao", UserDao.class);
}
public static void main(String[] args) {
		//save();
		//delete();
		//findUserById();
		//findUserFromId();
		//findUserByName();
		//findUsers();
		findUser();
		//update();
		//count();
		//findUserJoinAddrs();
		//findUserJoinAddr();
}
}
