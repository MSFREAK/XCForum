package com.bbx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bbx.dao.UserDao;
import com.bbx.domain.User;
import com.bbx.service.UserService;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserServiceImpl implements UserService {

	@Autowired(required = false)
	private UserDao userDao;

	@Override
	public void save(User user) {
		userDao.save(user);
	}

}
