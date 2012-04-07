package com.dmoreira.demo.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "answer")
public class Answer extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	private String answer;
	@ManyToOne(fetch = FetchType.EAGER)
	@NotNull
	@JsonIgnore
	private Person answerer;
	@ManyToOne(fetch = FetchType.EAGER)
	@NotNull
	@JsonIgnore
	private Question question;

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Person getAnswerer() {
		return answerer;
	}

	public void setAnswerer(Person answerer) {
		this.answerer = answerer;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Question getQuestion() {
		return question;
	}

}
