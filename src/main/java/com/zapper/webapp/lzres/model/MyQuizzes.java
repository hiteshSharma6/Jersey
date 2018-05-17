package com.zapper.webapp.lzres.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "id", "name", "showScoreTrendColumn", "showRemarksColumn", "evaluations" })
public class MyQuizzes {
	
	private String topicId;
	private String topicName;
	private boolean showScoreTrendColumn;
	private boolean showRemarksColumn;
	private List<QuizEvalSummary> evaluations;

	public MyQuizzes() {
		super();
	}

	public MyQuizzes(String topicId, String topicName, boolean showScoreTrendColumn, boolean showRemarksColumn,
			List<QuizEvalSummary> evaluations) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.showScoreTrendColumn = showScoreTrendColumn;
		this.showRemarksColumn = showRemarksColumn;
		this.evaluations = evaluations;
	}

	public MyQuizzes(String topicId) {
		super();
		this.topicId = topicId;
		this.topicName = null;
		this.showScoreTrendColumn = false;
		this.showRemarksColumn = false;
		this.evaluations = new ArrayList<>();
	}

	@JsonProperty("id")
	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	@JsonProperty("name")
	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public boolean getShowScoreTrendColumn() {
		return showScoreTrendColumn;
	}

	public void setShowScoreTrendColumn(boolean showScoreTrendColumn) {
		this.showScoreTrendColumn = showScoreTrendColumn;
	}

	public boolean getShowRemarksColumn() {
		return showRemarksColumn;
	}

	public void setShowRemarksColumn(boolean showRemarksColumn) {
		this.showRemarksColumn = showRemarksColumn;
	}

	public List<QuizEvalSummary> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(ArrayList<QuizEvalSummary> evaluations) {
		this.evaluations = evaluations;
	}

}
