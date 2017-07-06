package org.train.dao;

import org.train.entity.TrainNumber;

import java.util.List;

/**
 * Created by langye on 2017/2/25.
 */
public interface TrainDao extends BasicDao<TrainNumber> {

	public List<TrainNumber> findList();
}
