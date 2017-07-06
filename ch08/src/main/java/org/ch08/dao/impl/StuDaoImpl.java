package org.ch08.dao.impl;

import org.ch08.dao.StuDao;
import org.ch08.entity.Students;

import java.util.List;

/**
 * Created by langye on 2017/2/23.
 */
public class StuDaoImpl extends BaseDaoImpl<Students> implements StuDao {

@Override
public List<Students> findStudents() {
	String hql = "from Students s";
	return getSession().createQuery(hql).getResultList();
}
}
