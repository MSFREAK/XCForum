package com.bbx.dao.impl;

import org.springframework.stereotype.Repository;

import com.bbx.dao.UserDao;
import com.bbx.dao.base.impl.BaseDaoImpl;
import com.bbx.domain.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
