package org.ch08.dao;

import java.io.Serializable;

/**
 * Created by langye on 2017/2/23.
 */
public interface BaseDao<T> {

/*添加*/
public Serializable save(T t );

/*更新*/
public void update( T t );

/*删除*/
public void remove( T t );

/*根据ID查询*/
public T findById( Class<T> entityClass, Serializable id );

/*根据NAME查询*/
public T findByName( Class<T> entityClass, String name );

}
