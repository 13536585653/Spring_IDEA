package org.ch10.dao.impl;

import org.ch10.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * Created by langye on 2017/2/24.
 */
@Repository("userDao2")
public class UserDaoImpl2 implements UserDao{

@Override
public void save() {
	System.out.println("Hello dao2...");
}
}
