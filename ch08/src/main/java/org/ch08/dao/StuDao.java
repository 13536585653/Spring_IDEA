package org.ch08.dao;

import org.ch08.entity.Students;

import java.util.List;

/**
 * Created by langye on 2017/2/23.
 */
public interface StuDao extends BaseDao<Students>{

	/*查询所有学生*/
	public List<Students> findStudents();
}
