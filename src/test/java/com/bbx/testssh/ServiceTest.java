package com.bbx.testssh;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bbx.domain.User;

@Service("serviceTest")
public class ServiceTest {

	@Resource
	private SessionFactory sessionFactory;

	@Transactional
	public void saveTowUsers(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}
}
