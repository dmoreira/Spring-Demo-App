package com.dmoreira.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dmoreira.demo.dao.AbstractDAO;
import com.dmoreira.demo.service.AbstractService;

@Service
@Transactional
public abstract class AbstractServiceImpl<T> implements AbstractService<T> {
	
	private AbstractDAO<T> dao;

	public AbstractServiceImpl(AbstractDAO<T> dao) {
		this.dao = dao;
	}

	@Override
	public void persist(T t) {
		dao.persist(t);
		
	}

	@Override
	public T findById(long id) {
		return dao.findById(id);
		
	}

	@Override
	public List<T> find() {
		return dao.find();
		
	}

	@Override
	public void update(T t) {
		dao.update(t);
		
	}

	@Override
	public void delete(T t) {
		dao.delete(t);
		
	}

}
