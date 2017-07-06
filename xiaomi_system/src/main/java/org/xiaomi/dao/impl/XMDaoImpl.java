package org.xiaomi.dao.impl;

import org.xiaomi.dao.XMDao;
import org.xiaomi.entity.ScheduleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by langye on 2017/2/27.
 */
@Repository("xmDao")
public class XMDaoImpl extends BaseDaoImpl<ScheduleEntity> implements XMDao{
@Override
public List<ScheduleEntity> findList() {
	String jpql = "from ScheduleEntity s";
	return em.createQuery(jpql).getResultList();
}
}
