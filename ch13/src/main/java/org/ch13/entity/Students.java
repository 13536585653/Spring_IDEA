package org.ch13.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by wangl on 2017/2/27.
 * 实体
 */
@Entity
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
