package com.dmoreira.demo.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmoreira.demo.dao.PersonDAO;
import com.dmoreira.demo.dao.QuestionDAO;
import com.dmoreira.demo.domain.Person;
import com.dmoreira.demo.domain.Question;
import com.dmoreira.demo.service.QuestionService;

@Service
@Transactional
public class QuestionServiceImpl extends AbstractServiceImpl<Question> implements QuestionService {
	@Inject
	private PersonDAO personDAO;
	
	@Inject
	public QuestionServiceImpl(QuestionDAO questionDAO) {
		super(questionDAO);
	
	}

	@Override
	public void persist(Question q, long personId) {
		Person p = personDAO.findById(personId);
		q.setAsker(p);
		this.persist(q);
	}

}
