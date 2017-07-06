package org.ch06.dao;

import org.ch06.entity.Users;
import org.ch06.mapper.UserRowMapper;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;
import java.util.Map;

/**
 * Created by langye on 2017/2/21.
 */
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
/*	//注入jdbcTemplate对象
	private JdbcTemplate jdbcTemplate;
//通过set方法注入jdbc模板
public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
}*/

//根据用户表信息查询某个用户名
@Override
public Users findUser(Users user) {
	String sql = "SELECT * FROM USER_INFO U WHERE U.U_NAME = ?";
	//参数1：sql语句
	//参数2：rowMapper对象
	//参数3（可变参数）：sql中需要的参数，多个参数用逗号隔开
	//注意：queryForObject方法当查询不到任何记录时不会返回null，
	//因此直接抛出一个EmptyResultDataAccessException 的异常，那么我们就try catch来解决
	try{
		return getJdbcTemplate().queryForObject(sql,new UserRowMapper(),user.getUserName());
	}catch (EmptyResultDataAccessException e){
		return null;
	}
}

//根据用户名信息查询某个用户
@Override
public Users findUserByName(String userName) {
	String sql = "SELECT * FROM USER_INFO WHERE U_NAME = ?";
	return getJdbcTemplate().queryForObject(sql,new UserRowMapper(),userName);
}

//根据用户ID查询某个用户
@Override
public Users findUserById(String uid) {
	String sql = "SELECT * FROM USER_INFO WHERE U_ID = ?";
	return getJdbcTemplate().queryForObject(sql,new UserRowMapper(),uid);
}

//添加
@Override
public int save(Users user) {
	String sql = "INSERT INTO USER_INFO(U_ID, U_NAME,U_PASSWORD) VALUES(?,?,?)";
	//参数1、sql语句
	//参数2、sql语句所需的参数，是一个可变参数
	 return getJdbcTemplate().update(sql,user.getUid(),user.getUserName(),user.getPassword());
}

//更新
@Override
public int update(Users user) {
	String sql = "UPDATE USER_INFO SET U_NAME = ?,U_PASSWORD = ? WHERE U_ID = ?";
	return getJdbcTemplate().update(sql,user.getUserName(),user.getPassword(),user.getUid());
}

//删除
@Override
public int delete(String uid) {
	String sql = "DELETE FROM USER_INFO WHERE U_ID = ?";
	return getJdbcTemplate().update(sql,uid);
}


//查询用户列表
@Override
public List<Users> findUsers() {
	String sql = "SELECT * FROM USER_INFO";
	//查询list集合使用query方法
	return getJdbcTemplate().query(sql,new UserRowMapper());
}

//通过id查询用户名
@Override
public String findUserFromId(String uid) {
	String sql = "SELECT U.U_NAME FROM USER_INFO U WHERE U.U_ID = ?";
	//参数1、同上
	//参数2、要查询的属性类型
	return getJdbcTemplate().queryForObject(sql,String.class,uid);
}

//查询总记录数
@Override
public int count() {
	//参数同上
	String sql = "SELECT COUNT(*) FROM USER_INFO";
	return getJdbcTemplate().queryForObject(sql,int.class);
}

//连表查询
@Override
public List<Map<String, Object>> findUserJoinAddr(String uid) {
	String sql = "SELECT U.U_NAME,A.ADDRESS FROM USER_INFO U LEFT JOIN ADDR_INFO A ON U.U_ID = A.U_ID WHERE U.U_ID = ?";
	//使用模板提供的queryForList方法执行连表查询，返回的是一个List<Map<String,Object>>
	//针对连表查询返回多条记录
	return getJdbcTemplate().queryForList(sql,uid);
}

@Override
public Map<String, Object> findUserJoinAddr(String uid, String addr) {
	String sql = "SELECT U.U_NAME,A.ADDRESS FROM USER_INFO U LEFT JOIN ADDR_INFO A ON U.U_ID = A.U_ID WHERE U.U_ID = ? AND A.ADDRESS = ?";
	//当连接查询只返回一条记录时，使用queryForMap方法
	try{
		return getJdbcTemplate().queryForMap(sql,uid,addr);
	}catch (EmptyResultDataAccessException e){
		return null;
	}
}
}
