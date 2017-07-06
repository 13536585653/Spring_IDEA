package org.ch07.action;

import org.ch07.entity.Students;
import org.ch07.service.StuService;

/**
 * Created by wangl on 2017/2/22.
 */
public class StuAction {

    private Students stu;
    //ajax响应消息
    private String message;

    //注入service
    private StuService service;

    public void setService(StuService service) {
        this.service = service;
    }

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

    public String reg(){
        message = service.saveStu(stu);
        return "success";
    }
}
