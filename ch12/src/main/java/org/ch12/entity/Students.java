package org.ch12.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wangl on 2017/2/27.
 * 实体
 */
@Entity
/*
oracle创表失败的两种原因
1、如果是oracle数据建表，必须指定是哪个用户创的表
2、检查是否正确创建表，并且要避免用到关键字
@Table(name="STU_INFO",schema = "test1")*/
@Table(name="STU_INFO")
public class Students {

    private String sid;
    private String stuName;
    private int age;

    @Id
    @Column(name = "S_ID")
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    @Column(name = "S_NAME")
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Column(name = "S_AGE")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
