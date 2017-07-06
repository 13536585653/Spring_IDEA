package org.train.dao.impl;

import org.train.dao.TrainDao;
import org.train.entity.TrainNumber;

import java.util.List;

/**
 * Created by langye on 2017/2/25.
 */
public class TrainDaoImpl extends BasicDaoImpl<TrainNumber> implements TrainDao {
@Override
public List<TrainNumber> findList() {
	String hql = "FROM TrainNumber t";
	return getSession().createQuery(hql).getResultList();
}
}
