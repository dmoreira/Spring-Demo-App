package com.dmoreira.demo.dao;

import java.util.List;

/**
 * 
 * @author dmoreira
 *
 * @param <T>
 */
public interface AbstractDAO<T> {
	/**
	 * 
	 * @param t
	 */
	void persist(T t);

	/**
	 * 
	 * @param id
	 * @return
	 */
	T findById(long id);

	/**
	 * 
	 * @return
	 */
	List<T> find();

	/**
	 * 
	 * @param t
	 */
	void update(T t);

	/**
	 * 
	 * @param t
	 */
	void delete(T t);
}
