package com.zapper.webapp.lzres.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zapper.webapp.lzres.model.QuizEvalSummary;
import com.zapper.webapp.lzres.service.QuizDisplayService;

@Path("/quizdisplay")
public class QuizDisplayCtrl {
	
	QuizDisplayService quizService = new QuizDisplayService();
	
	@GET
	@Path("/userid/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<QuizEvalSummary> getQuizes(@PathParam("userId") int userId) {
		
		return quizService.getTopicWiseQuizes(userId);
		
	}

}
