package org.ch12.dao.impl;

import org.ch12.dao.BaseDao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

/**
 * Created by wangl on 2017/2/27.
 */
public class BaseDaoImpl<T> implements BaseDao<T>{

    //使用@PersistenceContext注入一个容器管理的EntityManager,
    //Spring为我们保证这个EntityManager是线程安全的,并且是受事务管理的
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
    public T findById(Class<T> entityClass, Serializable id) {
        return em.find(entityClass, id);
    }

    @Override
    public void update(T t) {
        em.merge(t);
    }
}
