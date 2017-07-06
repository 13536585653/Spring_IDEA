package org.train.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.orm.hibernate5.HibernateJdbcException;
import org.train.dao.BasicDao;

import java.io.Serializable;

/**
 * Created by langye on 2017/2/25.
 */
public class BasicDaoImpl<T> implements BasicDao<T> {
	private SessionFactory factory;

public SessionFactory getFactory() {
	return factory;
}

public void setFactory(SessionFactory factory) {
	this.factory = factory;
}

public Session getSession(){
	return factory.getCurrentSession();
}

@Override
public Serializable save(T t) {
	try{
		return getSession().save(t);
	}catch (HibernateJdbcException e){
		return null;
	}
}

@Override
public void delete(T t) {
	getSession().delete(t);
}

@Override
public T findById(Class<T> entityClass, Serializable id) {
	return getSession().find(entityClass,id);
}

@Override
public T findByName(Class<T> entityClass, String name) {
	try {
		return getSession().find(entityClass,"402886f25a7f6e2a015a7f6e33910000");
	}catch (EmptyResultDataAccessException e){
		return null;
	}
}

@Override
public void update(T t) {
	getSession().update(t);
}
}
