package org.xiaomi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.xiaomi.action.XMAction;
import org.xiaomi.dao.XMDao;
import org.xiaomi.entity.ScheduleEntity;
import org.xiaomi.service.BaseService;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

/**
 * Created by langye on 2017/2/28.
 */
@Service("service")
@Transactional(propagation = Propagation.REQUIRED)
public class ScheduleEntityImpl implements BaseService {

	@Autowired
	private XMDao dao;
private XMAction xmAction;

public ScheduleEntityImpl(XMAction xmAction) {
	this.xmAction = xmAction;
}

public XMAction getXmAction() {
	return xmAction;
}

public void setXmAction(XMAction xmAction) {
	this.xmAction = xmAction;
}

@Override
public String add(ScheduleEntity entity,String phone) {
	String message = "预约成功";
	try {
		entity.setSid(UUID.randomUUID().toString());
		entity.setBuyDate(new Timestamp(System.currentTimeMillis()));
		entity.setProductName(phone);
		dao.save(entity);
	}catch (RuntimeException e){
		e.printStackTrace();
		message = "预约失败";
		throw e;
	}
	return message;
}

@Override
public List<ScheduleEntity> findList() {
	return dao.findList();
}
}
