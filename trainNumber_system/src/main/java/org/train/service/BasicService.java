package org.train.service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by langye on 2017/2/25.
 */
public interface BasicService<T> {

	public Serializable add(T t);

	public void delete(T t);

	public String findById(T t);

	public String findByName(T t);

	public void update(T t);

	public List<T> findList();
}
