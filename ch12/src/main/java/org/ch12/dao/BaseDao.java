package org.ch12.dao;

import java.io.Serializable;

/**
 * Created by wangl on 2017/2/27.
 */
public interface BaseDao<T> {

    /**
     * 添加
     * @param t
     */
    public void save(T t);

    /**
     * 删除
     * @param t
     */
    public void delete(T t);

    /**
     * 依据ID查询
     * @param entityClass
     * @param id
     * @return
     */
    public T findById(Class<T> entityClass, Serializable id);

    /**
     * 更新
     * @param t
     */
    public void update(T t);
}
