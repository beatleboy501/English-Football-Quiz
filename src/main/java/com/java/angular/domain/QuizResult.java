package com.java.angular.domain;

import java.util.List;

public class QuizResult {
    String percentage;
    String title;
    public QuizResult(String title, List<Question> questions) throws Exception{
        this.title = title;
        int correctAnswers = 0;
        for(int i = 0; i < questions.size(); i++) {
            if(Integer.parseInt(questions.get(i).getUserAnswer()) == questions.get(i).getCorrectAnswer()) {
                correctAnswers++;
            }
        }
        double result = (correctAnswers / questions.size()) * (1/100);
        this.percentage = result + "%";
        System.out.println(this);
    }
}
