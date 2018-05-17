package com.zapper.webapp.lzres.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.zapper.webapp.lzres.database.ConceptDAO;
import com.zapper.webapp.lzres.database.TestScoreDAO;
import com.zapper.webapp.lzres.database.TopicDAO;
import com.zapper.webapp.lzres.model.MyQuizzes;
import com.zapper.webapp.lzres.model.QuizEvalSummary;
import com.zapper.webapp.lzres.model.TopicDTO;
import com.zapper.webapp.lzres.model.quizEvaluate.ScoreDTO;

public class QuizDisplayService {

	private List<MyQuizzes> myQuizzesList = null;

	public List<MyQuizzes> getTopicWiseQuizes(int userId) {
		try {
			Map<Integer, String> conceptTopicMap = getConceptTopicMap(userId);
			enterTopicDetailsInQuiz(conceptTopicMap);
			enterEachQuizScore(conceptTopicMap);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return myQuizzesList;

	}

	private void enterEachQuizScore(Map<Integer, String> conceptTopicMap) throws ClassNotFoundException, SQLException {
		Map<String, Map<Integer, List<ScoreDTO>>> scoreQuizMap = new TestScoreDAO().returnQuizWiseScore(conceptTopicMap);
		
		int i=0, j=0;
		
		for(Map.Entry<String, Map<Integer, List<ScoreDTO>>> topicList : scoreQuizMap.entrySet()) {
			MyQuizzes topicQuiz = myQuizzesList.get(i);
			j=0;
			
			for(Map.Entry<Integer, List<ScoreDTO>> conceptList : topicList.getValue().entrySet()) {
				List<ScoreDTO> conceptScore = conceptList.getValue();
				QuizEvalSummary conceptQuiz = topicQuiz.getEvaluations().get(j);
				
				System.out.println(conceptScore.toString());
				
				conceptQuiz.setCurrentScore(conceptScore.get(0));
				conceptScore.remove(0);
				
				conceptQuiz.setScoreTrend(conceptScore);
				
				++j;
				
			}
			++i;
			
		}

	}

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
		}
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
