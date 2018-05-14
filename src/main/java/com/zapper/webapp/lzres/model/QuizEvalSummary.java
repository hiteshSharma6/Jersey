package com.zapper.webapp.lzres.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zapper.webapp.lzres.model.quizEvaluate.RemarkDTO;
import com.zapper.webapp.lzres.model.quizEvaluate.ScoreDTO;

public class QuizEvalSummary {
	
	private String conceptName;
	private int conceptId;
	private boolean isLocked;
	private boolean isCompleted;
	private RemarkDTO remark;
	private ScoreDTO currentScore;
	private List<ScoreDTO> scoreTrend;

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

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
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

	public void setScoreTrend(ArrayList<ScoreDTO> scoreTrend) {
		this.scoreTrend = scoreTrend;
	}

}
