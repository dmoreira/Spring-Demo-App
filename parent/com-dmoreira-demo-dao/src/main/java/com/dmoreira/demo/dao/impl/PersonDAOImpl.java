package com.dmoreira.demo.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dmoreira.demo.dao.PersonDAO;
import com.dmoreira.demo.domain.Person;

@Repository
@Transactional
public class PersonDAOImpl extends AbstractDAOImpl<Person> implements PersonDAO {

	@Override
	public Person findByUserName(String userName) {
		Query query = entityManager.createQuery("select p from "
				+ entityClass.getSimpleName()
				+ " p where p.userName = :userName");
		query.setParameter("userName", userName);
		return (Person) query.getSingleResult();

	}

}
