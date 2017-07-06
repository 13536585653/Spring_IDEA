package org.xiaomi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by langye on 2017/2/27.
 *
 */
@Entity
@Table(name = "Schedule_Info")
public class ScheduleEntity {

	private String sid;
	private String productName;
	private Date buyDate;
	private String consignee;
	private String email;
	private String mobile;
	private String address;

	@Id
	@Column(name = "S_ID")
public String getSid() {
	return sid;
}

public void setSid(String sid) {
	this.sid = sid;
}
@Column(name = "PRODUCT_NAME")
public String getProductName() {
	return productName;
}

public void setProductName(String productName) {
	this.productName = productName;
}
@Column(name = "BUY_DATE")
public Date getBuyDate() {
	return buyDate;
}

public void setBuyDate(Date buyDate) {
	this.buyDate = buyDate;
}
@Column(name = "CONSIGNEE")
public String getConsignee() {
	return consignee;
}

public void setConsignee(String consignee) {
	this.consignee = consignee;
}
@Column(name = "EMAIL")
public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
@Column(name = "MOBILE",nullable = false)
public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}
@Column(name = "ADDRESS")
public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
}
