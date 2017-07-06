package org.vip.dao;

import java.io.Serializable;

/**
 * Created by langye on 2017/3/6.
 */
public interface BasicDao<T> {

	public void save(T t);

	public void remove(T t);

	public T findUsersById(Class<T> entityClass,Serializable id);

	public void update(T t);
}
