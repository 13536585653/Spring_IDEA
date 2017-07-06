package org.xiaomi.action;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.xiaomi.entity.ScheduleEntity;
import org.xiaomi.service.BaseService;

/**
 * Created by langye on 2017/2/28.
 */
@Controller("XMAction")
public class XMAction extends ActionSupport{
	private ScheduleEntity scheduleEntity;
	private String message;
	private String[] phone;
	@Autowired
	@Qualifier("service")
	private BaseService service;

public ScheduleEntity getScheduleEntity() {
	return scheduleEntity;
}

public void setScheduleEntity(ScheduleEntity scheduleEntity) {
	this.scheduleEntity = scheduleEntity;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String[] getPhone() {
		return phone;
	}

public void setPhone(String[] phone) {
		this.phone = phone;
	}

public BaseService getService() {
	return service;
}

public void setService(BaseService service) {
	this.service = service;
}



public String add(){
	System.out.println("add...");
	for(String p:phone){
        if(p!=null){
            message = "开始预约手机";
        }else {
            message = "你沒有选择手机！";
        }
    }
	return SUCCESS;
}


//自定义validateXxx方法
public void validateSave(){
	System.out.println("执行validateSave方法进行校验");
	//if(phone!=null && "langYe".equals(scheduleEntity.getConsignee())){
		//手动添加错误信息
		//addFieldError("scheduleEntity.consignee", "该用户已购买手机！");
	//}
}

public String save(){
    for(String p:phone){
        message = service.add(scheduleEntity,p);
    }
	return SUCCESS;
}
}
