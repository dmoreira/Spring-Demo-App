package com.dmoreira.demo.tests.setup;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.After;
import org.junit.Before;


public abstract class SetUpPersistenceUnity {
	
	private EntityManagerFactory emf;
    protected EntityManager em;
	
    @Before
	public void init() {
		emf = Persistence.createEntityManagerFactory("DemoAppPU");
        em = emf.createEntityManager();
	}
    
    @After
    public void close() {
        em.close();
        emf.close();
    }

}
