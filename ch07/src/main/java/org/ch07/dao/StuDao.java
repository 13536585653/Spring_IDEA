package org.ch07.dao;

import org.ch07.entity.Students;

/**
 * Created by wangl on 2017/2/22.
 */
public interface StuDao {

    public int save(Students stu);

    public int update(Students stu);

    public Students findStuById(String uid);
}
