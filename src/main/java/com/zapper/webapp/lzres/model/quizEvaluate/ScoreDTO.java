package com.zapper.webapp.lzres.model.quizEvaluate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScoreDTO {
	
	private String evaluationId;
	private String totalScore;
	private String displayColor;

	public ScoreDTO() {
		super();
	}

	public ScoreDTO(String evaluationId, String totalScore, String displayColor) {
		super();
		this.evaluationId = evaluationId;
		this.totalScore = totalScore;
		this.displayColor = displayColor;
	}

	@JsonProperty("id")
	public String getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(String evaluationId) {
		this.evaluationId = evaluationId;
	}

	@JsonProperty("score")
	public String getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(String totalScore) {
		this.totalScore = totalScore;
	}

	@JsonProperty("color")
	public String getDisplayColor() {
		return displayColor;
	}

	public void setDisplayColor(String displayColor) {
		this.displayColor = displayColor;
	}

}
