package org.xiaomi.service;

import org.xiaomi.entity.ScheduleEntity;

import java.util.List;

/**
 * Created by langye on 2017/2/28.
 */
public interface BaseService {

	public String add(ScheduleEntity entity,String phone);

	public List<ScheduleEntity> findList();
}
