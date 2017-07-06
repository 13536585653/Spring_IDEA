package org.train.entity;

/**
 * Created by langye on 2017/2/25.
 */
public class TrainNumber {

private String tid;
/*车次编号*/
private String tnumber;
/*起始站*/
private String fromStation;
/*终点站*/
private String toStation;
/*硬座数量*/
private int seatNum;
/*硬座价格*/
private double seatPrice;
/*硬卧数量*/
private int bedNum;
/*硬卧价格*/
private double bedPrice;

public String getTid() {
	return tid;
}

public void setTid(String tid) {
	this.tid = tid;
}

public String getTnumber() {
	return tnumber;
}

public void setTnumber(String tnumber) {
	this.tnumber = tnumber;
}

public String getFromStation() {
	return fromStation;
}

public void setFromStation(String fromStation) {
	this.fromStation = fromStation;
}

public String getToStation() {
	return toStation;
}

public void setToStation(String toStation) {
	this.toStation = toStation;
}

public int getSeatNum() {
	return seatNum;
}

public void setSeatNum(int seatNum) {
	this.seatNum = seatNum;
}

public double getSeatPrice() {
	return seatPrice;
}

public void setSeatPrice(double seatPrice) {
	this.seatPrice = seatPrice;
}

public int getBedNum() {
	return bedNum;
}

public void setBedNum(int bedNum) {
	this.bedNum = bedNum;
}

public double getBedPrice() {
	return bedPrice;
}

public void setBedPrice(double bedPrice) {
	this.bedPrice = bedPrice;
}
}
