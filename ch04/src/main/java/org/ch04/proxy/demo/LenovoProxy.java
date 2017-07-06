package org.ch04.proxy.demo;

/**
 * Created by langye on 2017/2/17.
 * 代理类，代理的目标对象就是Lenovo
 */
public class LenovoProxy implements Sell {
@Override
public void sell(double money) {
	//在付款给联想之前先扣除盈利的部分，将成本价格给联想
	double d = before(money);
	//创建Lenovo对象，并将成本价格给Lenovo
	new Lenovo().sell(d);
	//付款之后，结算盈利
	after(money);
}

//调用目标对象方法之前
private double before(double money){
	//成本价格
	double d = money - (money-2999);
	System.out.println("计算成本价格："+d);
	return d;
}

//调用目标方法对象之后
private double after(double money){
	double d = money - 2999;
	System.out.println("盈利价格："+d);
	return d;
}
}
