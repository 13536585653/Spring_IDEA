package org.ch12.service.impl;

import org.ch12.dao.StuDao;
import org.ch12.entity.Students;
import org.ch12.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * Created by wangl on 2017/2/27.
 */
@Service("stuService")
//使用注解配置事务，这个注解可以声明在类上，也可以声明在方法方法
//如果声明在类上，那么这个类的所有方法都会参与到事务中
//如果定义在方法上，那么当前方法会参与到事务中
//如果同时定义在类上和方法上，那么方法的事务会覆盖类上的事务配置
//propagation属性设置事务传播级别，同xml配置一样
//readOnly 设置事务的只读性，同xml一样
@Transactional(propagation = Propagation.REQUIRED)
public class StuServiceImpl implements StuService{

    //注入dao
    @Autowired
    private StuDao dao;

    @Override
    //如果这里也配置了事务，
    //并且是不同的传播级别，那么将覆盖类上的传播级别
    //@Transactional(propagation = Propagation.NEVER)
    public String add(Students stu) {
        String message = "添加成功";
        try {
            //添加主键
            stu.setSid(UUID.randomUUID().toString());
            dao.save(stu);
        }catch(RuntimeException e){
            e.printStackTrace();
            message = "添加失败";
            //为了能让spring正确捕的获异常，并执行事务的回滚
            //这里必须将异常重抛
            throw e;
        }
        return message;
    }

    @Override
    public List<Students> findStudents() {
        return dao.findStudents();
    }
}
