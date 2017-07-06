package org.ch04.proxy.demo;

/**
 * Created by langye on 2017/2/17.
 */
public class Client {

public static void main(String[] args) {
	Sell sell = new LenovoProxy();
	sell.sell(4999);
}
}
