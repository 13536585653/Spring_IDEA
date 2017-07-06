package org.ch06.dao;

import org.ch06.entity.Address;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by langye on 2017/2/22.
 */
public class AddrDaoImpl extends JdbcDaoSupport implements AddrDao {
@Override
public int saveAddr(Address address) {
	String sql = "INSERT INTO ADDR_INFO VALUES (?,?,?)";
	return getJdbcTemplate().update(sql,address.getAid(),address.getAddress(),address.getUid());
}
}
