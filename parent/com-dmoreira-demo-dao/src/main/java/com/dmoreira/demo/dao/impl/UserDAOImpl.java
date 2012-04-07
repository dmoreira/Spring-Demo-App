package com.dmoreira.demo.dao.impl;

import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dmoreira.demo.dao.UserDAO;

@Repository
@Transactional
public class UserDAOImpl extends AbstractDAOImpl<User> implements UserDAO {

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException, DataAccessException {
		Query query = entityManager.createQuery("select u from "
				+ entityClass.getSimpleName()
				+ " u where u.login = :userName");
		query.setParameter("userName", userName);
		return (UserDetails) query.getSingleResult();
	}

}
