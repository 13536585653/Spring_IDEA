package org.ch04.proxy.dao;

/**
 * Created by langye on 2017/2/17.
 */
public class DaoImpl2 implements DaoInf {
@Override
public void add() {
	System.out.println("hello1");
}

@Override
public void delete() {
	System.out.println("hello2");
}

@Override
public void findList() {
	System.out.println("hello3");
}

@Override
public void update() {
	System.out.println("hello4");
}

}
