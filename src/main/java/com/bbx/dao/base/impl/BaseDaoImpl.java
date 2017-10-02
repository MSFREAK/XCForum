package com.bbx.dao.base.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bbx.dao.base.BaseDao;

//@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {

	protected SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Autowired
	protected HibernateTemplate hibernateTemplate;

	// private Class<T> clazz;
	//
	// public BaseDaoImpl() {
	// // 通过反射等到T的真实类型
	// ParameterizedType pt = (ParameterizedType)
	// this.getClass().getGenericSuperclass();
	// this.clazz = (Class) pt.getActualTypeArguments()[0];
	// }

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(T entity) {
		getSession().save(entity);

		// hibernateTemplate.save(entity);
		// 方法4，事务提交后，成功保存数据到数据库
		// Session session = this.sessionFactory.openSession();
		// Transaction tx = session.beginTransaction();
		// session.save(entity);
		// tx.commit();// 这里一提交，数据就保存进数据库
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(T entity) {
		getSession().update(entity);
	}

	@Override
	public T getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> getByIds(Long[] ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
