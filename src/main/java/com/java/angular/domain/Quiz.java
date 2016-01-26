package com.java.angular.domain;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
	private  String title;
	private  List<Question> questions;

	public Quiz(String title, Question firstQuestion)
			throws Exception {
		this.title = title;
		this.questions = new ArrayList<Question>();
		this.questions.add(firstQuestion);
	}

	public Object[] getQuestions() {
		return questions.toArray();
	}

	public String getTitle() {
		return title;
	}

	public int getNumberOfQuestions() {
		return this.questions.size();
	}
	
	public void addQuestion(Question newQuestion){
		this.questions.add(newQuestion);
	}
}
