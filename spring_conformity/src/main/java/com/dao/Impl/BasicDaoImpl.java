package com.dao.Impl;

import com.dao.BasicDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;

/**
 * Created by langye on 2017/2/23.
 */
public class BasicDaoImpl<T> implements BasicDao<T> {
	private SessionFactory factory;

public void setFactory(SessionFactory factory) {
	this.factory = factory;
}

public Session getSession(){
	return factory.getCurrentSession();
}

@Override
public Serializable save(T t) {
	return getSession().save(t);
}

@Override
public void remove(T t) {
	getSession().remove(t);
}

@Override
public T findAdminById(Class<T> entityClass, Serializable id) {
	return getSession().find(entityClass,id);
}

@Override
public void update(T t) {
	getSession().update(t);
}
}
