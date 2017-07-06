package org.ch06.dao;

import org.ch06.entity.Users;

import java.util.List;
import java.util.Map;

/**
 * Created by langye on 2017/2/21.
 */
public interface UserDao {

	public Users findUser(Users user);

	public Users findUserByName(String userName);

	public Users findUserById(String uid);

	public int save(Users user);

	public int update(Users user);

	public int delete(String uid);

	public List<Users> findUsers();

	//根据id查询某个用户名
	public String findUserFromId(String uid);
	//查询总记录数
	public int count();


	//查询用户的信息包括住址
	public List<Map<String,Object>> findUserJoinAddr(String uid);
	//只返回一条记录
	public Map<String,Object> findUserJoinAddr(String uid,String addr);
}
