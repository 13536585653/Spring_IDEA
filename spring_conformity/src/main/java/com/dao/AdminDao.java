package com.dao;

import com.entity.Admin;

import java.util.List;

/**
 * Created by langye on 2017/2/23.
 */
public interface AdminDao extends BasicDao<Admin>{

	/*查询整个admin列表*/
	public List<Admin> findLists();
}
