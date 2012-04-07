package com.dmoreira.demo.service;

import com.dmoreira.demo.domain.Answer;

public interface AnswerService extends AbstractService<Answer> {
	
	/**
	 * 
	 * @param a
	 * @param personId
	 */
	void persist(Answer a, long personId, long questionId);
}
