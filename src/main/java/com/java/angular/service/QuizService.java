package com.java.angular.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.java.angular.domain.Question;
import com.java.angular.domain.Quiz;
import com.java.angular.domain.QuizResult;

public class QuizService {
	String quizTitle = "";
	Quiz serveThisQuiz = null;
	List<Question> questions = new ArrayList<>();

	public Quiz getDefaultQuiz() throws Exception {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(
					"/quiz.txt")));
			quizTitle = br.readLine();
			int id = Integer.parseInt(br.readLine());
			String text = br.readLine();
			String[] choices = br.readLine().split(";");
			int correct = Integer.parseInt(br.readLine());
			Question question = new Question(id, text, choices, correct);
			questions.add(question);
			serveThisQuiz = new Quiz(quizTitle, question);
			
			String nextLine; // because checking br.readLine for null moves the carriage
			
			while ((nextLine = br.readLine()) != null) {
				int nextId = Integer.parseInt(nextLine);
				String nextText = br.readLine();
				String[] nextChoices = br.readLine().split(";");
				int nextCorrect = Integer.parseInt(br.readLine());
				Question nextQuestion = new Question(nextId, nextText, nextChoices, nextCorrect);
				questions.add(nextQuestion);
				serveThisQuiz.addQuestion(nextQuestion);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		for(Question q : questions) {
			System.out.println(q.getQuestionText());
		}
		return serveThisQuiz;
	}

	public QuizResult getResult(String title, List<Question> questions) throws Exception {
		return new QuizResult(title, questions);
	}
}
