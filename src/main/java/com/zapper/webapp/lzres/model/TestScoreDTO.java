package com.zapper.webapp.lzres.model;

import java.util.Date;

public class TestScoreDTO {
	
	private int userId;
	private int id;
	private Date date;
	private String status;
	private short totalQn;
	private short attemptedQn;
	private short attemptPerc;
	private short accuracyPerc;
	private short score;
	private String totalTimeTaken;
	private short speed;
	private String improvementAreas;
	private String color;

	public TestScoreDTO() {
		super();
	}

	public TestScoreDTO(int id, int evaluationId, Date date, String status, short totalQn, short attemptedQn,
			short attemptPerc, short accuracyPerc, short score, String totalTimeTaken, short speed,
			String improvementAreas, String color) {
		super();
		this.userId = id;
		this.id = evaluationId;
		this.date = date;
		this.status = status;
		this.totalQn = totalQn;
		this.attemptedQn = attemptedQn;
		this.attemptPerc = attemptPerc;
		this.accuracyPerc = accuracyPerc;
		this.score = score;
		this.totalTimeTaken = totalTimeTaken;
		this.speed = speed;
		this.improvementAreas = improvementAreas;
		this.color = color;
	}

	public int getId() {
		return userId;
	}

	public void setId(int id) {
		this.userId = id;
	}

	public int getEvaluationId() {
		return id;
	}

	public void setEvaluationId(int evaluationId) {
		this.id = evaluationId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public short getTotalQn() {
		return totalQn;
	}

	public void setTotalQn(short totalQn) {
		this.totalQn = totalQn;
	}

	public short getAttemptedQn() {
		return attemptedQn;
	}

	public void setAttemptedQn(short attemptedQn) {
		this.attemptedQn = attemptedQn;
	}

	public short getAttemptPerc() {
		return attemptPerc;
	}

	public void setAttemptPerc(short attemptPerc) {
		this.attemptPerc = attemptPerc;
	}

	public short getAccuracyPerc() {
		return accuracyPerc;
	}

	public void setAccuracyPerc(short accuracyPerc) {
		this.accuracyPerc = accuracyPerc;
	}

	public short getScore() {
		return score;
	}

	public void setScore(short score) {
		this.score = score;
	}

	public String getTotalTimeTaken() {
		return totalTimeTaken;
	}

	public void setTotalTimeTaken(String totalTimeTaken) {
		this.totalTimeTaken = totalTimeTaken;
	}

	public short getSpeed() {
		return speed;
	}

	public void setSpeed(short speed) {
		this.speed = speed;
	}

	public String getImprovementAreas() {
		return improvementAreas;
	}

	public void setImprovementAreas(String improvementAreas) {
		this.improvementAreas = improvementAreas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
