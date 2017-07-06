package com.dao.Impl;

import com.dao.AdminDao;
import com.entity.Admin;

import java.util.List;

/**
 * Created by langye on 2017/2/23.
 */
public class AdminDaoImpl extends BasicDaoImpl<Admin> implements AdminDao {

@Override
public List<Admin> findLists() {
	String hql = "from Admin a";
	return getSession().createQuery(hql).getResultList();
}
}
