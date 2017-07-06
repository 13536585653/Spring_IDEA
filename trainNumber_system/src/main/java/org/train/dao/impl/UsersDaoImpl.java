package org.train.dao.impl;

import org.train.dao.UserDao;
import org.train.entity.Users;

import java.util.List;

/**
 * Created by langye on 2017/2/25.
 */
public class UsersDaoImpl extends BasicDaoImpl<Users> implements UserDao {
@Override
public List<Users> findList() {
	String hql = "FROM Users u";
	return getSession().createQuery(hql).getResultList();
}
}
