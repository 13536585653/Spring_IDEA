package com.dao;

import java.io.Serializable;

/**
 * Created by langye on 2017/2/23.
 */
public interface BasicDao <T>{

	/*添加*/
	public Serializable save(T t);

	/*删除*/
	public void remove(T t);

	/*根据ID查询管理员*/
	public T findAdminById(Class<T> entityClass ,Serializable id);

	/*修改*/
	public void update(T t);
}
