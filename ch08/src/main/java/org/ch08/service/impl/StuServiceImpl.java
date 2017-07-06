package org.ch08.service.impl;

import org.ch08.dao.StuDao;
import org.ch08.entity.Students;
import org.ch08.service.StuService;

import java.io.Serializable;

/**
 * Created by langye on 2017/2/23.
 */
public class StuServiceImpl implements StuService {

/*注入dao*/
private StuDao dao;

public void setDao(StuDao dao) {
	this.dao = dao;
}

@Override
public String add(Students s) {
	Serializable id = dao.save(s);
	return (id != null) ? "添加成功":"添加失败";
}

@Override
public Students findStuById(String sid) {
	return dao.findById(Students.class,sid);
}

@Override
public void update(Students s) {
	dao.update(s);
}

@Override
public void remove(Students s) {
	dao.remove(s);
}
}
