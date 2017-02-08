package com.java.angular.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuizResult {

    private int total;
    private int score;
    public float percentage;

    public QuizResult(List<Question> questions) {
        this.total = questions.size();
        this.score = 0;
        for(int i = 0; i < questions.size(); i++) {
            if(Integer.parseInt(questions.get(i).getUserAnswer()) == questions.get(i).getCorrectAnswer()) {
                this.score++;
            }
        }
        this.percentage = (score * 100 / total);
    }
}
