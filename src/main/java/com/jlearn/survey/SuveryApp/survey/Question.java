package com.jlearn.survey.SuveryApp.survey;

import java.util.List;

public class Question {
	private String id;
	private String description;
	private List <String> options;
	private String rightAnswer;
	
	public Question() {
		
	}
	
	public Question(String id, String description, List<String> options, String rightAnswer) {
		super();
		this.id = id;
		this.description = description;
		this.options = options;
		this.rightAnswer = rightAnswer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}	
}
