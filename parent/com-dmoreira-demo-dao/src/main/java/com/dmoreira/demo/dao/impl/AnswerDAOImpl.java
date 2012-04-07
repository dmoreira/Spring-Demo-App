package com.dmoreira.demo.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dmoreira.demo.dao.AnswerDAO;
import com.dmoreira.demo.domain.Answer;

@Repository
@Transactional
public class AnswerDAOImpl extends AbstractDAOImpl<Answer> implements AnswerDAO {

}
