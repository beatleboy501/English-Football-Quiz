package com.java.angular.rest;

import com.java.angular.domain.QuizResult;
import com.java.angular.domain.UserResponse;
import com.java.angular.service.QuizService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/results")
@Produces(MediaType.APPLICATION_JSON)
public class ResultRestService {


    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response result(UserResponse userResponse) {
        QuizService quizService = new QuizService();
        QuizResult result = quizService.getResult(userResponse.getQuestions());
        return Response.ok(result.percentage).build();
    }

}
