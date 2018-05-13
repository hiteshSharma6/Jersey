package com.zapper.webapp.lzres.model;

public class EvaluationDTO {
	
	private int evaluationId;
	private String evaluationName;
	private String evaluationDescription;
	private int topicId;
	private String className;
	private String author;
	private String targetUser;
	private String contentType;
	private String name;
	private int id;

	public EvaluationDTO() {
		super();
	}

	public EvaluationDTO(int evaluationId, String evaluationName, String evaluationDescription, int topicId,
			String className, String author, String targetUser, String contentType, String name, int id) {
		super();
		this.evaluationId = evaluationId;
		this.evaluationName = evaluationName;
		this.evaluationDescription = evaluationDescription;
		this.topicId = topicId;
		this.className = className;
		this.author = author;
		this.targetUser = targetUser;
		this.contentType = contentType;
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

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
