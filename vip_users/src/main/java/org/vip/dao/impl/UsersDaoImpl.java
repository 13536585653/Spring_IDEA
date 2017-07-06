package org.vip.dao.impl;

import org.springframework.stereotype.Repository;
import org.vip.dao.UsersDao;
import org.vip.entity.Users;

import java.util.List;

/**
 * Created by langye on 2017/3/6.
 */
@Repository("usersDao")
public class UsersDaoImpl extends BasicDaoImpl<Users> implements UsersDao{
@Override
public List<Users> findList() {
	return em.createQuery("from Users u").getResultList();
}
}
