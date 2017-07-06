package com.action;

import com.entity.Admin;
import com.service.AdminService;

/**
 * Created by langye on 2017/2/23.
 */
public class AdminAction{
	private Admin admin;
	private String message;
	private AdminService service;

public AdminService getService() {
	return service;
}

public void setService(AdminService service) {
	this.service = service;
}

public Admin getAdmin() {
	return admin;
}

public void setAdmin(Admin admin) {
	this.admin = admin;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String login(){
	message = service.add(admin);
	return "success";
}
}
