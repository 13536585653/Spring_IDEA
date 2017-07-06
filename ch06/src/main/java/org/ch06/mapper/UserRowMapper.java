package org.ch06.mapper;


import org.ch06.entity.Users;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by langye on 2017/2/21.
 * RowMapper对象就是将数据库的列封装到相应的实体中
 * 也就是所谓O/R Mapping
 */
public class UserRowMapper implements RowMapper<Users> {
@Override
public Users mapRow(ResultSet rs, int i) throws SQLException {
	Users user = new Users();
	user.setUid(rs.getString(1));
	user.setUserName(rs.getString(2));
	user.setPassword(rs.getString(3));
	return user;
}
}
