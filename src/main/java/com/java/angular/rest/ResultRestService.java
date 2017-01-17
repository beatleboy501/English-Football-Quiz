package com.java.angular.rest;

import com.java.angular.domain.Question;
import com.java.angular.domain.QuizResult;
import com.java.angular.service.QuizService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/results")
public class ResultRestService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public QuizResult result(String title, List<Question> questions) throws Exception {
        QuizService quizService = new QuizService();
        return quizService.getResult(title, questions);
    }
}
