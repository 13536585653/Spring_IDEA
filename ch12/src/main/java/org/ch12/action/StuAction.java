package org.ch12.action;

import org.ch12.entity.Students;
import org.ch12.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by wangl on 2017/2/27.
 */
@Controller("stuAction")
public class StuAction {

    private Students stu;

    //注入一个Service
    @Autowired
    private StuService service;

    //接收返回消息
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

    public String add(){
        message = service.add(stu);
        return "success";
    }

}
