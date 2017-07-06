package org.ch06.test;

import org.ch06.dao.AddrDao;
import org.ch06.entity.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.UUID;

/**
 * Created by langye on 2017/2/22.
 */
public class AddrDaoTest {

public static void main(String[] args) {
	int count = 0;
	ApplicationContext context = new FileSystemXmlApplicationContext("ch06\\target\\ch06-1.0-SNAPSHOT\\WEB-INF\\applicationContext.xml");
	AddrDao dao = context.getBean("addrDao", AddrDao.class);

	Address addr1 = new Address();
	addr1.setAid(UUID.randomUUID().toString());
	addr1.setAddress("american");
	addr1.setUid("95796732-b1f0-49a1-bbb8-b55c8a1be67b");

	Address addr2 = new Address();
	addr2.setAid(UUID.randomUUID().toString());
	addr2.setAddress("canada");
	addr2.setUid("95796732-b1f0-49a1-bbb8-b55c8a1be67b");
	count = dao.saveAddr(addr1);
	System.out.println("成功插入"+count+"条");
	count = dao.saveAddr(addr2);
	System.out.println("成功插入"+count+"条");
}
}
