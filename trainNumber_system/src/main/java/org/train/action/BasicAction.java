package org.train.action;

import org.train.entity.TrainNumber;
import org.train.entity.Users;
import org.train.service.BasicService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by langye on 2017/2/25.
 */
public class BasicAction {

	private BasicService service;
	private Users users;
	private String message;
	private TrainNumber trainNumber;
	private Serializable serializable;
	private List<TrainNumber> list;

public BasicService getService() {
	return service;
}

public void setService(BasicService service) {
	this.service = service;
}
public Users getUsers() {
	return users;
}

public void setUsers(Users users) {
	this.users = users;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public TrainNumber getTrainNumber() {
	return trainNumber;
}

public void setTrainNumber(TrainNumber trainNumber) {
	this.trainNumber = trainNumber;
}

public Serializable getSerializable() {
	return serializable;
}

public void setSerializable(Serializable serializable) {
	this.serializable = serializable;
}

public List<TrainNumber> getList() {
	return list;
}

public void setList(List<TrainNumber> list) {
	this.list = list;
}

public String login(){
	System.out.println("login");
	message = service.findByName(users);
	return "login";
}

public String addTrainNumber(){
	System.out.println("find");
	serializable = service.add(trainNumber);
	return "addTrainNumber";
}

public String findTrainList(){
	System.out.println("findList");
	list = service.findList();
	return "findTrainList";
}
}
