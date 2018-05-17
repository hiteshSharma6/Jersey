package com.zapper.webapp.lzres.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.zapper.webapp.lzres.database.ConceptDAO;
import com.zapper.webapp.lzres.database.TopicDAO;
import com.zapper.webapp.lzres.model.MyQuizzes;
import com.zapper.webapp.lzres.model.QuizEvalSummary;
import com.zapper.webapp.lzres.model.TopicDTO;

public class QuizDisplayService {

	private List<MyQuizzes> myQuizzesList = null;

	public List<MyQuizzes> getTopicWiseQuizes(int userId) {
		List<MyQuizzes> myQuizzesList = getUserQuizzes(userId);
		
		return myQuizzesList;
	}

	private List<MyQuizzes> getUserQuizzes(int userId) {
		try {
			Map<Integer, String> conceptTopicMap = getConceptTopicMap(userId);
			enterTopicDetailsInQuiz(conceptTopicMap);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return myQuizzesList;
		
		/*try {
			int allConceptIds[] = getAllConceptIdForUser(userId);
			List<ConceptDTO> conceptsList = getAllConceptsList(allConceptIds); 
			SortedSet<String> allTopicsId = getSortedTopics(conceptsList);
			List<TopicDTO> topicList = getAllTopicsDetail(allTopicsId);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}*/
	}
/*
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
*/

	private void enterTopicDetailsInQuiz(Map<Integer, String> conceptTopicMap) throws ClassNotFoundException, SQLException {
		Set<String> topicsId = getTopicsId(conceptTopicMap);
		List<TopicDTO> topics = new TopicDAO().returnAllTopicSummary(topicsId);
		
		for(MyQuizzes quiz : myQuizzesList) {
			TopicDTO topic = topics.get(0);
			quiz.setTopicName(topic.getTopicName());
			quiz.setShowScoreTrendColumn(topic.getShowScoreTrendColumn());
			quiz.setShowRemarksColumn(topic.getShowRemarksColumn());
			topics.remove(0);
		}

	}

	private Set<String> getTopicsId(Map<Integer, String> conceptTopicMap) {
		Set<String> topicsId = new TreeSet<>();
		
		for(String topics : conceptTopicMap.values()) {
			topicsId.add(topics);
			System.out.println("TOPics: "+ topics);
		}
		System.out.println("Set :"+ topicsId);
		return topicsId;

	}

	private Map<Integer, String> getConceptTopicMap(int userId) throws ClassNotFoundException, SQLException {
		myQuizzesList = new ConceptDAO().returnAllCDetailsAndTId(userId);
		Map<Integer, String> conceptTopicMap = new HashMap<>();

		for(MyQuizzes myQuiz : myQuizzesList) {
			for(QuizEvalSummary quizEval : myQuiz.getEvaluations()) {
				conceptTopicMap.put(quizEval.getConceptId(), myQuiz.getTopicId());
			}
		}
		return conceptTopicMap;

	}

}
