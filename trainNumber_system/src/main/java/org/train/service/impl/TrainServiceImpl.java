package org.train.service.impl;

import org.train.dao.TrainDao;
import org.train.entity.TrainNumber;
import org.train.service.BasicService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by langye on 2017/2/25.
 */
public class TrainServiceImpl implements BasicService<TrainNumber>{
	private TrainDao dao;

public TrainDao getDao() {
	return dao;
}

public void setDao(TrainDao dao) {
	this.dao = dao;
}


@Override
public Serializable add(TrainNumber trainNumber) {
	Serializable s = dao.save(trainNumber);
	return s != null ? "添加成功":"添加失败";
}

@Override
public void delete(TrainNumber trainNumber) {
	dao.delete(trainNumber);
}

@Override
public String findById(TrainNumber trainNumber) {
	return null;
}

@Override
public String findByName(TrainNumber trainNumber) {
	return null;
}

@Override
public void update(TrainNumber trainNumber) {
	dao.update(trainNumber);
}

@Override
public List<TrainNumber> findList() {
	return dao.findList();
}
}
