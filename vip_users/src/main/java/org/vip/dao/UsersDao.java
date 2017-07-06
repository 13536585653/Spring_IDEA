package org.vip.dao;

import org.vip.entity.Users;

import java.util.List;

/**
 * Created by langye on 2017/3/6.
 */
public interface UsersDao extends BasicDao<Users>{
	public List<Users> findList();
}
