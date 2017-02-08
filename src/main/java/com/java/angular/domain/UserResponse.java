package com.java.angular.domain;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class UserResponse {
    private final List<Question> questions;

    public UserResponse(@JsonProperty("questions") List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
