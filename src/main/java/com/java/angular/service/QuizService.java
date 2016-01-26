package com.java.angular.service;

import java.io.*;

import com.java.angular.domain.Question;
import com.java.angular.domain.Quiz;

public class QuizService {

	public Quiz getDefaultQuiz() throws Exception {
		
		String quizTitle = "";
		Quiz serveThisQuiz = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(
					"/quiz.txt")));
			quizTitle = br.readLine();
			
			serveThisQuiz = new Quiz(quizTitle, new Question(Integer.parseInt(br.readLine()),
					br.readLine(), br.readLine().split(";")));
			
			String nextLine; // because checking br.readLine for null moves the carriage
			
			while ((nextLine = br.readLine()) != null) {
				serveThisQuiz.addQuestion(new Question(Integer.parseInt(nextLine),
						br.readLine(), br.readLine().split(";")));
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return serveThisQuiz;
	}
}
