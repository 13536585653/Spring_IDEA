package org.train.dao;

import org.train.entity.Users;

import java.util.List;

/**
 * Created by langye on 2017/2/25.
 */
public interface UserDao extends BasicDao<Users>{

	public List<Users> findList();
}
