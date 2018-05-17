package com.zapper.webapp.lzres.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.zapper.webapp.lzres.model.quizEvaluate.RemarkDTO;
import com.zapper.webapp.lzres.model.quizEvaluate.ScoreDTO;

@JsonPropertyOrder({ "name", "id", "isCompleted", "isLocked", "remark", "currentScore", "scoreTrend" })
public class QuizEvalSummary {
	
	private String conceptName;
	private int conceptId;
	private boolean isLocked;
	private boolean isCompleted;
	private RemarkDTO remark;
	private ScoreDTO currentScore;
	private List<ScoreDTO> scoreTrend;

	@Override
	public String toString() {
		return "QuizEvalSummary [conceptName=" + conceptName + ", conceptId=" + conceptId + ", isLocked=" + isLocked
				+ ", isCompleted=" + isCompleted + ", remark=" + remark + ", currentScore=" + currentScore
				+ ", scoreTrend=" + scoreTrend + "]";
	}

	public QuizEvalSummary() {
		super();
	}

	public QuizEvalSummary(String conceptName, int conceptId, boolean isLocked, boolean isCompleted, RemarkDTO remark,
			ScoreDTO currentScore, List<ScoreDTO> scoreTrend) {
		super();
		this.conceptName = conceptName;
		this.conceptId = conceptId;
		this.isLocked = isLocked;
		this.isCompleted = isCompleted;
		this.remark = remark;
		this.currentScore = currentScore;
		this.scoreTrend = scoreTrend;
	}

	@JsonProperty("name")
	public String getConceptName() {
		return conceptName;
	}

	public void setConceptName(String conceptName) {
		this.conceptName = conceptName;
	}

	@JsonProperty("id")
	public int getConceptId() {
		return conceptId;
	}

	public void setConceptId(int conceptId) {
		this.conceptId = conceptId;
	}

	public boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public RemarkDTO getRemark() {
		return remark;
	}

	public void setRemark(RemarkDTO remark) {
		this.remark = remark;
	}

	public ScoreDTO getCurrentScore() {
		return currentScore;
	}

	public void setCurrentScore(ScoreDTO currentScore) {
		this.currentScore = currentScore;
	}

	public List<ScoreDTO> getScoreTrend() {
		return scoreTrend;
	}

	public void setScoreTrend(List<ScoreDTO> scoreTrend) {
		this.scoreTrend = scoreTrend;
	}

}
