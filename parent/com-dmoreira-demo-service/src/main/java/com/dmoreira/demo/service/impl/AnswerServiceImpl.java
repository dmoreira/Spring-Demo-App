package com.dmoreira.demo.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmoreira.demo.dao.AnswerDAO;
import com.dmoreira.demo.dao.PersonDAO;
import com.dmoreira.demo.dao.QuestionDAO;
import com.dmoreira.demo.domain.Answer;
import com.dmoreira.demo.domain.Person;
import com.dmoreira.demo.domain.Question;
import com.dmoreira.demo.service.AnswerService;

@Service
@Transactional
public class AnswerServiceImpl extends AbstractServiceImpl<Answer> implements AnswerService {
	@Inject
	private PersonDAO personDAO;
	@Inject 
	private QuestionDAO questionDAO;
	
	@Inject
	public AnswerServiceImpl(AnswerDAO AnswerDAO) {
		super(AnswerDAO);
	
	}

	@Override
	public void persist(Answer a, long personId, long questionId) {
		Person p = personDAO.findById(personId);
		Question q = questionDAO.findById(questionId);
		a.setAnswerer(p);
		a.setQuestion(q);
		this.persist(a);

	}

}
