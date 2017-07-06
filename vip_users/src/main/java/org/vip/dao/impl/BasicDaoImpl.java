package org.vip.dao.impl;

import org.vip.dao.BasicDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by langye on 2017/3/6.
 */
public class BasicDaoImpl<T> implements BasicDao<T>{
	@PersistenceContext
	protected EntityManager em;

@Override
public void save(T t) {
	em.persist(t);
}

@Override
public void remove(T t) {
	em.remove(t);
}

@Override
public T findUsersById(Class<T> entityClass, Serializable id) {
	return em.find(entityClass,id);
}

@Override
public void update(T t) {
	em.merge(t);
}
}
