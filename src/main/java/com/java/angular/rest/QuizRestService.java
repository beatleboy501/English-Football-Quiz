package com.java.angular.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.java.angular.domain.Quiz;
import com.java.angular.service.QuizService;


@Path("/questions")
public class QuizRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Quiz getDefaultUserInJSON() throws Exception {
        QuizService quizService = new QuizService();
        return quizService.getDefaultQuiz();
    }
}