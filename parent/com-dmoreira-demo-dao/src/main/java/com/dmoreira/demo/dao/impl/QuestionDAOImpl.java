package com.dmoreira.demo.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dmoreira.demo.dao.QuestionDAO;
import com.dmoreira.demo.domain.Question;

@Repository
@Transactional
public class QuestionDAOImpl extends AbstractDAOImpl<Question> implements QuestionDAO {

}
