package org.ch03.demo2.service;

import org.ch03.demo2.dao.UserDaoInf;

/**
 * Created by langye on 2017/2/16.
 */
public class UserServiceImp implements UserServiceInf {
	//定义一个dao接口
private UserDaoInf dao;
public void setDao(UserDaoInf dao){
	this.dao = dao;
}
@Override
public void save() {
	dao.save();
}
}
