package org.ch08.action;

import org.ch08.entity.Students;
import org.ch08.service.StuService;

/**
 * Created by langye on 2017/2/23.
 */
public class StuAction {

	private Students stu;
	private StuService service;
	private String message;

public Students getStu() {
	return stu;
}

public void setStu(Students stu) {
	this.stu = stu;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public StuService getService() {
	return service;
}

public void setService(StuService service) {
	this.service = service;
}

/*添加*/
public String add(){
	System.out.println("hello");
	message = service.add(stu);
	return "success";
}
}
