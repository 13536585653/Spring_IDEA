package org.ch13.service;

import org.ch13.entity.Students;

import java.util.List;

/**
 * Created by wangl on 2017/2/27.
 */
public interface StuService {

    public String add(Students stu);

    public List<Students> findStudents();
}
