package org.ch06.mapper;

import org.ch06.entity.Address;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by langye on 2017/2/22.
 */
public class AddrRowMapper implements RowMapper<Address> {
@Override
public Address mapRow(ResultSet rs, int i) throws SQLException {
	Address address = new Address();
	address.setUid(rs.getString(1));
	address.setAddress(rs.getString(2));
	address.setUid(rs.getString(3));
	return address;
}
}
