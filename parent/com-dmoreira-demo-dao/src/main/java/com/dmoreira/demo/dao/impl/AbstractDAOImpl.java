package com.dmoreira.demo.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dmoreira.demo.dao.AbstractDAO;

@Repository
@Transactional
public abstract class AbstractDAOImpl<T> implements AbstractDAO<T> {
	@PersistenceContext
	protected EntityManager entityManager;
	protected Class<T> entityClass;

	@PostConstruct
	@SuppressWarnings({ "unused", "unchecked" })
	private void setEntityClass() {
		this.entityClass = (Class<T>) ((ParameterizedType) (getClass()
				.getGenericSuperclass())).getActualTypeArguments()[0];
	}

	@Override
	public void persist(T t) {
		entityManager.persist(t);

	}

	@Override
	public T findById(long id) {
		return entityManager.find(entityClass, id);

	}

	@Override
	public List<T> find() {
		TypedQuery<T> query = entityManager.createQuery("SELECT t FROM "
				+ entityClass.getSimpleName() + " t", entityClass);
		return query.getResultList();
	}

	@Override
	public void update(T t) {
		entityManager.merge(t);

	}

	@Override
	public void delete(T t) {
		entityManager.remove(entityManager.contains(t) ? t : entityManager
				.merge(t));

	}

}
