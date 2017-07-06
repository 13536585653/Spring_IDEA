package org.ch07.mapper;

import org.ch07.entity.Students;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by wangl on 2017/2/22.
 */
public class StuRowMapper implements RowMapper<Students>{

    @Override
    public Students mapRow(ResultSet rs, int i) throws SQLException {
        Students s = new Students();
        s.setSid(rs.getString(1));
        s.setStuName(rs.getString(2));
        s.setAge(rs.getInt(3));
        return s;
    }
}
