package org.ch04.proxy.demo2;

import org.ch04.proxy.dao.DaoImpl;
import org.ch04.proxy.dao.DaoInf;
import org.ch04.proxy.util.LogUitl;

/**
 * Created by langye on 2017/2/17.
 */
public class DaoProxy implements DaoInf {
	private DaoInf dao = new DaoImpl();
@Override
public void add() {
	dao.add();
	after();
}

@Override
public void delete() {
	dao.delete();
	after();
}

@Override
public void findList() {
	dao.findList();
	after();
}

@Override
public void update() {
	dao.update();
	after();
}

//执行目标对象之后的方法
private void after(){
	LogUitl.log();
}
}
