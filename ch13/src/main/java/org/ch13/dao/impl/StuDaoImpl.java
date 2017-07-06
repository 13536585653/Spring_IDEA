package org.ch13.dao.impl;

import org.ch13.dao.StuDao;
import org.ch13.entity.Students;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangl on 2017/2/27.
 */
@Repository("stuDao")
public class StuDaoImpl extends BaseDaoImpl<Students> implements StuDao{

    @Override
    public List<Students> findStudents() {
        String jpql = "from Students s";
        return em.createQuery(jpql).getResultList();
    }
}
