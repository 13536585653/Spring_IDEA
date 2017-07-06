package org.ch08.service;

import org.ch08.entity.Students;

/**
 * Created by langye on 2017/2/23.
 */
public interface StuService {

	public String add(Students s);

	public Students findStuById(String sid);

	public void update(Students s);

	public void remove(Students s);
}
