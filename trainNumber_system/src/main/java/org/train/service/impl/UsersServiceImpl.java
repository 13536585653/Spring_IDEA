package org.train.service.impl;

import org.train.dao.UserDao;
import org.train.entity.Users;
import org.train.service.BasicService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by langye on 2017/2/25.
 */
public class UsersServiceImpl implements BasicService<Users> {

	private UserDao dao;

public UserDao getDao() {
	return dao;
}

public void setDao(UserDao dao) {
	this.dao = dao;
}


@Override
public Serializable add(Users users) {
	return dao.save(users);
}

@Override
public void delete(Users users) {
	dao.delete(users);
}

@Override
public String findById(Users users) {
	return null;
}

@Override
public String findByName(Users users) {
	Users users1 = dao.findByName(Users.class,users.getUname());
	return users1 != null && users.getUname().equals(users1.getUname()) && users.getUpwd().equals(users1.getUpwd())? "YES":"NO";
}

@Override
public void update(Users users) {
	dao.update(users);
}

@Override
public List<Users> findList() {
	return null;
}
}
