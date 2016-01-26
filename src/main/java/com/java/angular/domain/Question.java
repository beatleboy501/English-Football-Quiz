package com.java.angular.domain;

import java.util.HashMap;

public class Question {
	int id; // the question number
	int userAnswerNumber; // number of the answer user picked
	boolean isAnswered; // has the question been answered already
	String questionText; // the actual question
	String userAnswerChoice; // answer user picked
	HashMap<Integer, String> answers; // all the possible choices

	public Question(int id, String questionText, String[] possibleChoices) {
		this.id = id;
		this.questionText = questionText;
		answers = new HashMap<Integer, String>();
		for (int i = 0; i < possibleChoices.length; i++) {
			answers.put(i, possibleChoices[i]);
		}
		isAnswered = false;
	}

	public void answerTheQuestion(int userAnswer) {
		this.userAnswerNumber = userAnswer;
		userAnswerChoice = answers.get(userAnswerNumber);
		isAnswered = true;
	}

	public int getId() {
		return id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public String getUserAnswer() {
		if (isAnswered) {
			return userAnswerChoice;
		} else {
			return "Unanswered";
		}
	}
	
	public Object[] getPossibleChoices() {
		return answers.values().toArray();
	}
}