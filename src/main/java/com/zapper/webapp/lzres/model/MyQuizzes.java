package com.zapper.webapp.lzres.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyQuizzes {
	
	private String topicId;
	private String topicName;
	private String showScoreTrendColumn;
	private String showRemarksColumn;
	private List<QuizEvalSummary> evaluations;

	public MyQuizzes() {
		super();
	}

	public MyQuizzes(String topicId, String topicName, String showScoreTrendColumn, String showRemarksColumn,
			List<QuizEvalSummary> evaluations) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.showScoreTrendColumn = showScoreTrendColumn;
		this.showRemarksColumn = showRemarksColumn;
		this.evaluations = evaluations;
	}

	@JsonProperty("id")
	public String getId() {
		return topicId;
	}

	public void setId(String topicId) {
		this.topicId = topicId;
	}

	@JsonProperty("name")
	public String getName() {
		return topicName;
	}

	public void setName(String topicName) {
		this.topicName = topicName;
	}

	public String getShowScoreTrendColumn() {
		return showScoreTrendColumn;
	}

	public void setShowScoreTrendColumn(String showScoreTrendColumn) {
		this.showScoreTrendColumn = showScoreTrendColumn;
	}

	public String getShowRemarksColumn() {
		return showRemarksColumn;
	}

	public void setShowRemarksColumn(String showRemarksColumn) {
		this.showRemarksColumn = showRemarksColumn;
	}

	public List<QuizEvalSummary> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(ArrayList<QuizEvalSummary> evaluations) {
		this.evaluations = evaluations;
	}

}
