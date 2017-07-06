package org.ch04.proxy.dao;

/**
 * Created by langye on 2017/2/17.
 */
public class DaoImpl implements DaoInf {
@Override
public void add() {
	System.out.println("添加操作...");
}

@Override
public void delete() {
	System.out.println("删除操作...");
}

@Override
public void findList() {
	System.out.println("查询操作...");
}

@Override
public void update() {
	System.out.println("更新操作...");
}
}
