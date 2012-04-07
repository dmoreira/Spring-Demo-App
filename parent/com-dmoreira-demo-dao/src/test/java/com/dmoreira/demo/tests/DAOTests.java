package com.dmoreira.demo.tests;

import java.util.Calendar;

import javax.inject.Inject;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.dmoreira.demo.dao.PersonDAO;
import com.dmoreira.demo.domain.Person;

@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = { "classpath:spring/dao-config.xml" })  
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class DAOTests {
	
	@Inject
	private PersonDAO personDAO;
	
	@Ignore
	@Test
	public void testPersist() {
		Calendar calendar = Calendar.getInstance();
		Person p = new Person();
		p.setFirstName("Davi");
		p.setLastName("Moreira");
		p.setCreated(calendar);

		personDAO.persist(p);
		
		
		Person p1 = personDAO.findByUserName("davi@ask.com");
		Assert.assertEquals("Davi", p1.getFirstName());
	}
	
	@Ignore
	@Test
	public void testFindPersons() {
		personDAO.find().size();
	}
	
	@Ignore
	@Test
	public void testFindById() {
		personDAO.findById(1);
	}
	
	@Ignore
	@Test 
	public void testUpdate() {
		Person p = new Person();
		p.setFirstName("jesse");
		p.setLastName("james");
		personDAO.persist(p);
		p = personDAO.findById(1);
		p.setFirstName("billy");
		personDAO.update(p);
	}
	
	@Ignore
	@Test
	public void testDelete() {
		Person p = new Person();
		p.setFirstName("jesse");
		p.setLastName("james");
		personDAO.persist(p);
		p = personDAO.findById(2);
		personDAO.delete(p);
	}

}
