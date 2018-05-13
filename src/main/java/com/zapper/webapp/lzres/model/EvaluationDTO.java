package com.zapper.webapp.lzres.model;

public class EvaluationDTO {
	
	private int evaluationId;
	private String evaluationName;
	private String evaluationDescription;
	private int topicId;
	private String className;
	private String author;
	private String targetUser;
	private  String name;
	private int id;

	public EvaluationDTO() {
		super();
	}

	public EvaluationDTO(int evaluationId, String evaluationName, String evaluationDescription, int topicId,
			String className, String author, String targetUser, String name, int id) {
		super();
		this.evaluationId = evaluationId;
		this.evaluationName = evaluationName;
		this.evaluationDescription = evaluationDescription;
		this.topicId = topicId;
		this.className = className;
		this.author = author;
		this.targetUser = targetUser;
		this.name = name;
		this.id = id;
	}

	public int getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(int evaluationId) {
		this.evaluationId = evaluationId;
	}

	public String getEvaluationName() {
		return evaluationName;
	}

	public void setEvaluationName(String evaluationName) {
		this.evaluationName = evaluationName;
	}

	public String getEvaluationDescription() {
		return evaluationDescription;
	}

	public void setEvaluationDescription(String evaluationDescription) {
		this.evaluationDescription = evaluationDescription;
	}

	public int getTopicId() {
		return topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTargetUser() {
		return targetUser;
	}

	public void setTargetUser(String targetUser) {
		this.targetUser = targetUser;
	}

	public String getConceptName() {
		return name;
	}

	public void setConceptName(String name) {
		this.name = name;
	}

	public int getConceptId() {
		return id;
	}

	public void setConceptId(int id) {
		this.id = id;
	}

}
