package com.service.impl;

import com.dao.AdminDao;
import com.entity.Admin;
import com.service.AdminService;

import java.io.Serializable;

/**
 * Created by langye on 2017/2/23.
 */
public class AdminServiceImpl implements AdminService {
	private AdminDao dao;

public AdminDao getDao() {
	return dao;
}

public void setDao(AdminDao dao) {
	this.dao = dao;
}

@Override
public String add(Admin a) {
	Serializable s = dao.save(a);
	return (s != null) ? "登录成功":"登录失败";
}

@Override
public void remove(Admin a) {

}

@Override
public Admin findAdminById(String aId) {
	return null;
}

@Override
public void update(Admin a) {

}
}
