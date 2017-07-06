package org.ch10.service.impl;

import org.ch10.dao.UserDao;
import org.ch10.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by langye on 2017/2/24.
 */
@Service("userService2")
public class UserServiceImpl2 implements UserService {

	@Resource(name = "userDao2")
	private UserDao dao;


@Override
public void save() {
	dao.save();
}
}
