package com.dmoreira.demo.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmoreira.demo.dao.PersonDAO;
import com.dmoreira.demo.domain.Person;
import com.dmoreira.demo.service.PersonService;

@Service
@Transactional
public class PersonServiceImpl extends AbstractServiceImpl<Person> implements PersonService {
	
	@Inject
	public PersonServiceImpl(PersonDAO personDAO) {
		super(personDAO);
	
	}

	@Override
	public Person findByUserName(String userName) {
		return this.findByUserName(userName);
		
	}

}
