package com.dmoreira.demo.web.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dmoreira.demo.domain.Answer;
import com.dmoreira.demo.domain.Person;
import com.dmoreira.demo.domain.Question;

@Controller
public class MagicController {
	private EntityManagerFactory emf;
    private EntityManager em;
	
	@RequestMapping(value="/magic/star/pony/pony/666/slayer/master/of/puppets/ilovemagic", method = RequestMethod.GET)
	public String doMagicStuffs() {
		this.init();
		this.initDB();
		this.close();
		return "home";
	}
	
	public void init() {
		emf = Persistence.createEntityManagerFactory("DemoAppPU");
        em = emf.createEntityManager();
	}
	
	public void initDB() {
		// create persons
		em.getTransaction().begin();
		Person p1 = new Person();
		p1.setFirstName("Davi");
		p1.setLastName("Moreira");
		em.persist(p1);
		
		Person p2 = new Person();
		p2.setFirstName("Teo");
		p2.setLastName("Moreira");
		em.persist(p2);
		
		Person p3 = new Person();
		p3.setFirstName("Newdude");
		p3.setLastName("Moreira");
		em.persist(p3);
		

		// create questions
		Question q1 = new Question();
		
		Question q2 = new Question();
		
		Question q3 = new Question();
		
		Question q4 = new Question();
		
		Question q5 = new Question();

		// create answers
		Answer a1 = new Answer();
		
		Answer a2 = new Answer();
		
		Answer a3 = new Answer();
		
		Answer a4 = new Answer();
		
		Answer a5 = new Answer();
		
		Answer a6 = new Answer();
		
		Answer a7 = new Answer();
		
		Answer a8 = new Answer();
		
		// create users
		em.createNativeQuery("INSERT INTO `demo_app`.`user` (`login`, `password`, `person_id`) VALUES ('davi', 'davi', 1)").executeUpdate();
		em.createNativeQuery("INSERT INTO `demo_app`.`user` (`login`, `password`, `person_id`) VALUES ('teo', 'teo', 2)").executeUpdate();
		em.createNativeQuery("INSERT INTO `demo_app`.`user` (`login`, `password`, `person_id`) VALUES ('newdude', 'newdude', 3)").executeUpdate();
		
		//create roles
		em.createNativeQuery("INSERT INTO `demo_app`.`role` (`name`) VALUES ('ROLE_USER')").executeUpdate();
		em.createNativeQuery("INSERT INTO `demo_app`.`role` (`name`) VALUES ('ROLE_ADMIN')").executeUpdate();
		
		//map user role
		em.createNativeQuery("INSERT INTO `demo_app`.`role_user` (`roles_id`, `users_id`) VALUES (1, 1)").executeUpdate();
		em.createNativeQuery("INSERT INTO `demo_app`.`role_user` (`roles_id`, `users_id`) VALUES (1, 2)").executeUpdate();
		em.createNativeQuery("INSERT INTO `demo_app`.`role_user` (`roles_id`, `users_id`) VALUES (1, 3)").executeUpdate();
		em.getTransaction().commit();

	}
	
	 public void close() {
	        em.close();
	        emf.close();
	    }

}
