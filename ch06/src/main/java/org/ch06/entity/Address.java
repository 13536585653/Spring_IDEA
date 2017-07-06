package org.ch06.entity;

/**
 * Created by langye on 2017/2/21.
 */
public class Address {

	private String aid;
	private String address;

	//外键关联
	private String uid;
public String getAid() {
	return aid;
}

public void setAid(String aid) {
	this.aid = aid;
}

public String getUid() {
	return uid;
}

public void setUid(String uid) {
	this.uid = uid;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
}
