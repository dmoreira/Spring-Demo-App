package com.dmoreira.demo.dao;

import com.dmoreira.demo.domain.Person;

public interface PersonDAO extends AbstractDAO<Person> {
	Person findByUserName(String userName);
	
}
