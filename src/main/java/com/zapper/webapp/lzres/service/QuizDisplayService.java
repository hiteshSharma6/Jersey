package com.zapper.webapp.lzres.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zapper.webapp.lzres.database.ConceptDAO;
import com.zapper.webapp.lzres.database.EvaluationDAO;
import com.zapper.webapp.lzres.database.QuizDisplayDAO;
import com.zapper.webapp.lzres.database.TestScoreDAO;
import com.zapper.webapp.lzres.database.TopicDAO;
import com.zapper.webapp.lzres.model.ConceptDTO;
import com.zapper.webapp.lzres.model.MyQuizzes;
import com.zapper.webapp.lzres.model.QuizEvalSummary;
import com.zapper.webapp.lzres.model.TopicDTO;

public class QuizDisplayService {

	ConceptDAO conceptDAO = null;
	EvaluationDAO evaluationDAO = null;
	QuizDisplayDAO quizDisplayDAO = null;
	TestScoreDAO testScoreDAO = null;
	TopicDAO topicDAO = null;
	
	private List<QuizEvalSummary> finalQuizzesEvalList = new ArrayList<>(); 
	private List<MyQuizzes> finalMyQuizzesList = new ArrayList<>();
	
	public List<QuizEvalSummary> getTopicWiseQuizes(int userId) {
		getUserQuizzes(userId);
		
		ObjectMapper mapper = new ObjectMapper();
//		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString();
//		System.out.println(json);
		
		return null;
	}

	private void getUserQuizzes(int userId) {
		try {
			int allConceptIds[] = getAllConceptIdForUser(userId);
			List<ConceptDTO> conceptsList = getAllConceptsList(allConceptIds); 
			SortedSet<String> allTopicsId = getSortedTopics(conceptsList);
			List<TopicDTO> topicList = getAllTopicsDetail(allTopicsId);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private List<TopicDTO> getAllTopicsDetail(SortedSet<String> allTopicsId) throws ClassNotFoundException, SQLException {
		List<TopicDTO> allTopicsList = new TopicDAO().returnAllTopicSummary(allTopicsId);
		return null;
	}

	private SortedSet<String> getSortedTopics(List<ConceptDTO> conceptsList) {
		SortedSet<String> sortedTopic = new TreeSet<>();
		for(ConceptDTO concept : conceptsList) {
			sortedTopic.add(concept.getTopicId());
		}
		
		return sortedTopic;
	}

	private List<ConceptDTO> getAllConceptsList(int[] allConceptIds) throws ClassNotFoundException, SQLException {
		List<ConceptDTO> allConceptsList = new ConceptDAO().returnAllCNameAndTId(allConceptIds);
		addConceptNameToList(allConceptsList);
		
		return allConceptsList;
		
	}

	private void addConceptNameToList(List<ConceptDTO> allConceptsList) {
		int i = 0;
		for(ConceptDTO concept : allConceptsList) {
			finalQuizzesEvalList.get(i++).setConceptName(concept.getConceptName());
		}
		
	}

	private int[] getAllConceptIdForUser(int userId) throws ClassNotFoundException, SQLException {
		List<QuizEvalSummary> quizzesEval = new QuizDisplayDAO().returnAllConceptId(userId);
		int i=0, allConceptIds[] = new int[quizzesEval.size()];
		
		for(QuizEvalSummary quizEval : quizzesEval) {
			allConceptIds[i++] = quizEval.getConceptId();
		}
		addQuizzesEvalToList(quizzesEval);
		
		return allConceptIds;
		
	}

	private void addQuizzesEvalToList(List<QuizEvalSummary> quizzesEval) {
		finalQuizzesEvalList = quizzesEval;
		
	}

}
