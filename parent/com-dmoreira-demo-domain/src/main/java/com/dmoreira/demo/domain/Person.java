package com.dmoreira.demo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	@OneToMany(mappedBy = "asker", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Question> questions;
	@OneToMany(mappedBy = "answerer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Answer> answers;
	@OneToOne(mappedBy = "person")
	private User user;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

}
