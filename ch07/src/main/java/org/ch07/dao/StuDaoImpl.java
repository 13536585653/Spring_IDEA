package org.ch07.dao;

import org.ch07.entity.Students;
import org.ch07.mapper.StuRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by wangl on 2017/2/22.
 */
public class StuDaoImpl extends JdbcDaoSupport implements StuDao{

    @Override
    public int save(Students stu) {
        String sql = "INSERT INTO STU_INFO(S_ID,S_NAME,S_AGE) VALUES(?,?,?)";
        return getJdbcTemplate().update(sql, stu.getSid(), stu.getStuName(), stu.getAge());
    }

    @Override
    public int update(Students stu) {
        String sql = "UPDATE STU_INFO SET S_NAME = ?, S_AGE = ? WHERE S_ID = ?";
        return getJdbcTemplate().update(sql, stu.getStuName(), stu.getAge(), stu.getSid());
    }

    @Override
    public Students findStuById(String uid) {
        String sql = "SELECT * FROM STU_INFO WHERE S_ID = ?";
        return getJdbcTemplate().queryForObject(sql, new StuRowMapper(), uid);
    }
}
