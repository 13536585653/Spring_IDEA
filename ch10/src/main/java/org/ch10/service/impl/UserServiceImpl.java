package org.ch10.service.impl;

import org.ch10.dao.UserDao;
import org.ch10.dao.impl.UserDaoImpl;
import org.ch10.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by langye on 2017/2/24.
 *
 */
@Service("userService1")
public class UserServiceImpl implements UserService {

/*注入dao，在属性上注入可以省略set方法*/
	/*name中的值userDao1对应UserDaoImpl类中的@Repository的userDao1*/
	@Resource(name = "userDao1",type = UserDaoImpl.class)
	private UserDao dao;

	@Override
	public void save() {
		dao.save();
	}
}
