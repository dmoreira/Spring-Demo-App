package com.dmoreira.demo.service;

import javassist.NotFoundException;

import com.dmoreira.demo.domain.Question;

public interface QuestionService extends AbstractService<Question> {

	/**
	 * 
	 * @param q
	 * @param personId
	 * @throws NotFoundException 
	 */
	void persist(Question q, long personId);
}
