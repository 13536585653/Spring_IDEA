package org.vip.service;

import java.io.Serializable;

/**
 * Created by langye on 2017/3/6.
 */
public interface BasicService<T> {

	public void add(T t);

	public void remove(T t);

	public T findById(Class<T> entityClass, Serializable id);

	public T findList();

	public void update(T t);
}
