package com.dmoreira.demo.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "question")
public class Question extends AbstractEntity {
	private static final long serialVersionUID = 1L;
	private String question;
	@ManyToOne(fetch = FetchType.EAGER)
	@NotNull
	private Person asker;
	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Answer> answers;
	private long views;

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Person getAsker() {
		return asker;
	}

	public void setAsker(Person asker) {
		this.asker = asker;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public void setViews(long views) {
		this.views = views;
	}

	public long getViews() {
		return views;
	}

}
