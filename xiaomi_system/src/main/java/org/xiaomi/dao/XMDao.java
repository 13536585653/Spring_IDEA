package org.xiaomi.dao;

import org.xiaomi.entity.ScheduleEntity;

import java.util.List;

/**
 * Created by langye on 2017/2/27.
 */
public interface XMDao extends BaseDao<ScheduleEntity> {
	public List<ScheduleEntity> findList();
}
