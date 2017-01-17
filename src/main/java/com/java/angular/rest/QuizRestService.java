package com.java.angular.rest;

import com.java.angular.domain.Question;
import com.java.angular.domain.Quiz;
import com.java.angular.domain.QuizResult;
import com.java.angular.service.QuizService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/questions")
public class QuizRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Quiz getDefaultUserInJSON() throws Exception {
        QuizService quizService = new QuizService();
        return quizService.getDefaultQuiz();
    }

}
