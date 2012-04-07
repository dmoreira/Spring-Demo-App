package com.dmoreira.demo.tests;

import java.util.Calendar;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.dmoreira.demo.domain.Answer;
import com.dmoreira.demo.domain.Person;
import com.dmoreira.demo.domain.Question;
import com.dmoreira.demo.service.AnswerService;
import com.dmoreira.demo.service.PersonService;
import com.dmoreira.demo.service.QuestionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/service-config.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class ServiceTests {

	@Inject
	private PersonService personService;

	@Inject
	private QuestionService questionService;

	@Inject
	private AnswerService answerService;

	@Before
	public void setUp() {
		Person p = new Person();
		p.setFirstName("Davi");
		p.setLastName("Moreira");
		p.setCreated(Calendar.getInstance());
		personService.persist(p);

		Person p1 = new Person();
		p1.setFirstName("Teo");
		p1.setLastName("Moreira");
		p1.setCreated(Calendar.getInstance());
		personService.persist(p1);
		
		Person p2 = new Person();
		p2.setFirstName("Newdude");
		p2.setLastName("Moreira");
		p2.setCreated(Calendar.getInstance());
		personService.persist(p2);

		Question q = new Question();
		q.setQuestion("what is the meaning of life, the universe and everything?");
		q.setAsker(p);

		questionService.persist(q);

	}

	@Ignore
	@Test
	public void testPersist() {
		Person p = new Person();
		p.setFirstName("jesse");
		p.setLastName("jamessss");
		personService.persist(p);
	}

	@Ignore
	@Test
	public void testPersistQuestion() {
		Calendar calendar = Calendar.getInstance();
		Person p = new Person();
		p.setFirstName("Davi");
		p.setLastName("Moreira");
		p.setCreated(calendar);
		personService.persist(p);

		Question q = new Question();
		q.setQuestion("what is the meaning of life, the universe and everything?");

		questionService.persist(q, 1);
	}

	@Ignore
	@Test
	public void testPersistAnswer() {
		Answer a = new Answer();
		a.setAnswer("the meaning of life is 43");
		
		Answer a1 = new Answer();
		a1.setAnswer("the meaning of life is to be good.");
		
		answerService.persist(a, 2, 1);
		answerService.persist(a1, 3, 1);
		
		System.out.println(answerService.find().size());
		
	}

}
