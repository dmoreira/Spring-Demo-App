package com.dmoreira.demo.tests;

import java.util.Calendar;
import java.util.List;

import javax.persistence.TypedQuery;

import org.junit.Test;

import com.dmoreira.demo.domain.Person;
import com.dmoreira.demo.tests.setup.SetUpPersistenceUnity;

public class JPATests extends SetUpPersistenceUnity {

	@Test
	public void insertPerson() {
		Calendar calendar = Calendar.getInstance();
		Person p1 = new Person();
		p1.setFirstName("davi");
		p1.setLastName("moreira");
		p1.setCreated(calendar);

		Person p2 = new Person();
		p2.setFirstName("teo");
		p2.setLastName("moreira");
		p2.setCreated(calendar);

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.getTransaction().commit();
	}

	@Test
	public void getPersonList() {
		Calendar calendar = Calendar.getInstance();
		Person p1 = new Person();
		p1.setFirstName("davi");
		p1.setLastName("moreira");
		p1.setCreated(calendar);

		Person p2 = new Person();
		p2.setFirstName("teo");
		p2.setLastName("moreira");
		p2.setCreated(calendar);

		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		TypedQuery<Person> query = em.createQuery("SELECT r FROM "
				+ Person.class.getSimpleName() + " r ", Person.class);

		List<Person> list = query.getResultList();
		em.getTransaction().commit();
		
	}

}
