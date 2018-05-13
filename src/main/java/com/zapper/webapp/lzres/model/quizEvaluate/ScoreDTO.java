package com.zapper.webapp.lzres.model.quizEvaluate;

public class ScoreDTO {
	
	private String id;
	private String score;
	private String color;

	public ScoreDTO() {
		super();
	}

	public ScoreDTO(String id, String score, String color) {
		super();
		this.id = id;
		this.score = score;
		this.color = color;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
