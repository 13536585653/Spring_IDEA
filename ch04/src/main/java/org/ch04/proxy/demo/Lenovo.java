package org.ch04.proxy.demo;

/**
 * Created by langye on 2017/2/17.
 */
public class Lenovo implements Sell{

	@Override
	public void sell(double money){
		System.out.println("出售一台联想笔记本电脑，实收金额："+money);
	}
}
