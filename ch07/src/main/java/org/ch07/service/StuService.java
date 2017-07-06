package org.ch07.service;

import org.ch07.dao.StuDao;
import org.ch07.entity.Students;

/**
 * Created by wangl on 2017/2/22.
 */
public interface StuService {

    public String saveStu(Students stu);

    public String updateStu(Students stu);

    public Students findStuById(String sid);

}
