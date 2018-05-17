package com.zapper.webapp.lzres.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zapper.webapp.lzres.model.MyQuizzes;
import com.zapper.webapp.lzres.service.QuizDisplayService;

@Path("/quizdisplay")
public class QuizDisplayCtrl {
	
	QuizDisplayService quizService = new QuizDisplayService();
	
	@GET
	@Path("/userid/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getQuizes(@PathParam("userId") int userId) {
		
		List<MyQuizzes> myquizzes = quizService.getTopicWiseQuizes(userId);
		
		ObjectMapper mapper = new ObjectMapper();
		String json = "";
		try {
			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(myquizzes);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return json;
		

	}

}
