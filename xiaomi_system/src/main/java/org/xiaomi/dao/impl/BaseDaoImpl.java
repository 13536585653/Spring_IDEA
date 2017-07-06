package org.xiaomi.dao.impl;

import org.xiaomi.dao.BaseDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by langye on 2017/2/27.
 */

public class BaseDaoImpl<T> implements BaseDao<T> {
	@PersistenceContext
	protected EntityManager em;
@Override
public void save(T t) {
	em.persist(t);
}

@Override
public void delete(T t) {
	em.remove(t);
}

@Override
public T findById(Class<T> entityClass, String id) {
	return em.find(entityClass,id);
}

@Override
public void update(T t) {
	em.merge(t);
}
}
