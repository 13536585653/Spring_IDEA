package com.service;

import com.entity.Admin;

/**
 * Created by langye on 2017/2/23.
 */
public interface AdminService {

	public String add(Admin a);

	public void remove(Admin a);

	public Admin findAdminById(String aId);

	public void update(Admin a);
}
