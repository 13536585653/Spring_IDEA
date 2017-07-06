package org.xiaomi.dao;

/**
 * Created by langye on 2017/2/27.
 */
public interface BaseDao<T> {

	public void save(T t);

	public void delete(T t);

	public T findById(Class<T> entityClass,String id);

	public void update(T t);
}
