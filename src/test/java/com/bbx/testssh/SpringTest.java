package com.bbx.testssh;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bbx.domain.User;

public class SpringTest {

	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

	// 测试SessionFactory
	@Test
	public void testSessionFactory() {
		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}

	// 测试事物
	@Test
	public void testTransaction() {
		ServiceTest serviceTest = (ServiceTest) ac.getBean("serviceTest");
		User user = new User();
		user.setId("1");
		user.setUsername("lisiddd");
		serviceTest.saveTowUsers(user);
	}
}
