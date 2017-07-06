package org.ch04.proxy.demo2;

import org.ch04.proxy.dao.DaoInf;

/**
 * Created by langye on 2017/2/17.
 */
public class ServiceClicent {

public static void main(String[] args) {
	DaoInf dao = new DaoProxy();
	System.out.println("客户端记录操作：");
	dao.add();
	dao.delete();
	dao.findList();
	dao.update();
}
}
