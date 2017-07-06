package org.ch12.dao;

import org.ch12.entity.Students;

import java.util.List;

/**
 * Created by wangl on 2017/2/27.
 */
public interface StuDao extends BaseDao<Students>{

    //查询所有学生
    public List<Students> findStudents();
}
