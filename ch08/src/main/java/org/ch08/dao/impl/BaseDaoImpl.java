package org.ch08.dao.impl;

import org.ch08.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;

/**
 * Created by langye on 2017/2/23.
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

//由spring注入一个SessionFactory对象进来
private SessionFactory sessionFactory;

//通过set方法注入
public void setSessionFactory( SessionFactory setSessionFactory ) {
	this.sessionFactory = setSessionFactory;
}

//提供一个获取sessionFactory方法，子类可继承
public Session getSession() {
	return sessionFactory.getCurrentSession();
}

@Override
public Serializable save(T t) {
	return getSession().save( t );
}

@Override
public void update(T t) {
	getSession().update( t );
}

@Override
public void remove(T t) {
	getSession().remove( t );
}

@Override
public T findById(Class<T> entityClass, Serializable id) {
	return getSession().find( entityClass, id );
}

@Override
public T findByName(Class<T> entityClass, String name) {
	return getSession().find(entityClass,name);
}
}

