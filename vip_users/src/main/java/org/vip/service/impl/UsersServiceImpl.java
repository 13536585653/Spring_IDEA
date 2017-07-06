package org.vip.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.vip.dao.BasicDao;
import org.vip.dao.UsersDao;
import org.vip.entity.Users;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * Created by langye on 2017/3/6.
 */
@Service("usersService")
@Transactional(propagation = Propagation.REQUIRED)
public class UsersServiceImpl implements BasicDao<Users> {
	private UsersDao dao;

public UsersDao getDao() {
	return dao;
}
@Resource(name = "usersDao")
public void setDao(UsersDao dao) {
	this.dao = dao;
}

@Override
public void save(Users users) {
	dao.save(users);
}

@Override
public void remove(Users users) {
	dao.remove(users);
}

@Override
public Users findUsersById(Class<Users> entityClass, Serializable id) {
	return dao.findUsersById(entityClass,id);
}

@Override
public void update(Users users) {
	dao.update(users);
}
}
