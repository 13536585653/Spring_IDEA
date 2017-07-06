package org.ch07.service;

import org.ch07.dao.StuDao;
import org.ch07.entity.Students;
import org.springframework.dao.EmptyResultDataAccessException;

import java.util.UUID;

/**
 * Created by wangl on 2017/2/22.
 */
public class StuServiceImpl implements StuService{

    //注入dao
    private StuDao dao;

    public void setDao(StuDao dao) {
        this.dao = dao;
    }

    @Override
    public String saveStu(Students stu) {
        //txAdvice生成主键
        stu.setSid(UUID.randomUUID().toString());
        //保存
        int row = dao.save(stu);
        return (row > 0) ? "添加成功" : "添加失败";
    }

    @Override
    public String updateStu(Students stu) {
        int row = dao.update(stu);
        return (row > 0) ? "更新成功" : "更新失败";
    }

    @Override
    public Students findStuById(String sid) {
        try {
            Students stu = dao.findStuById(sid);
            stu.setStuName("stu4");
            stu.setAge(22);
            updateStu(stu);
            return stu;
        }catch(EmptyResultDataAccessException e){
            //捕获特定的异常并返回null值
            return null;
        }
    }
}
