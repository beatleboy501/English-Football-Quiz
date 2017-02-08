package com.java.angular.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.HashMap;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Question {
	int id; // the question number
	int userAnswerNumber; // number of the answer user picked
	boolean isAnswered; // has the question been answered already
	String questionText; // the actual question
	String[] possibleChoices;
	String userAnswer;
	HashMap<Integer, String> answers; // all the possible choices
	private int correctAnswer;

	public Question(int id, String questionText, String[] possibleChoices, int correctAnswer) {
		this.id = id;
		this.questionText = questionText;
		answers = new HashMap<Integer, String>();
		this.possibleChoices = possibleChoices;
		for (int i = 0; i < this.possibleChoices.length; i++) {
			answers.put(i, this.possibleChoices[i]);
		}
		isAnswered = false;
		this.correctAnswer = correctAnswer;
	}

	public int getCorrectAnswer() {
		return correctAnswer;
	}

	public String getUserAnswer() {
		return userAnswer;
	}

	public int getId() {
		return id;
	}

	public String getQuestionText() {
		return questionText;
	}
	
	public Object[] getPossibleChoices() {
		return answers.values().toArray();
	}

	// dummy constructor needed
	public Question() {

	}
}
