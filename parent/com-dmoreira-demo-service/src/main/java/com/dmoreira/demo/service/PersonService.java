package com.dmoreira.demo.service;

import com.dmoreira.demo.domain.Person;

public interface PersonService extends AbstractService<Person> {
	Person findByUserName(String userName);
	
}
