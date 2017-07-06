package org.train.dao;

import java.io.Serializable;

/**
 * Created by langye on 2017/2/25.
 */
public interface BasicDao<T> {

	public Serializable save(T t);

	public void delete(T t);

	public T findById(Class<T> entityClass,Serializable id);

	public T findByName( Class<T> entityClass, String name );

	public void update(T t);
}
