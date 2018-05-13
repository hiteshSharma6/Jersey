package com.zapper.webapp.lzres.model;

import java.util.ArrayList;
import java.util.List;

import com.zapper.webapp.lzres.model.quizEvaluate.RemarkDTO;
import com.zapper.webapp.lzres.model.quizEvaluate.ScoreDTO;

public class QuizSummaryDTO {
	
	private String name;
	private int id;
	private boolean isLocked;
	private boolean isCompleted;
	private RemarkDTO remark;
	private ScoreDTO currentScore;
	private List<ScoreDTO> scoreTrend;

	public QuizSummaryDTO() {
		super();
	}

	public QuizSummaryDTO(int id, String name, boolean isLocked, boolean isCompleted, RemarkDTO remark,
			ScoreDTO currentScore, List<ScoreDTO> scoreTrend) {
		super();
		this.id = id;
		this.name = name;
		this.isLocked = isLocked;
		this.isCompleted = isCompleted;
		this.remark = remark;
		this.currentScore = currentScore;
		this.scoreTrend = scoreTrend;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setConceptId(String name) {
		this.name = name;
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
