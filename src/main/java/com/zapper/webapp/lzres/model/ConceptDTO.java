package com.zapper.webapp.lzres.model;

public class ConceptDTO {
	
	private int conceptId;
	private String conceptName;
	private String description;
	private String topicId;

	public ConceptDTO() {
		super();
	}

	public ConceptDTO(int conceptId, String conceptName, String description, String topicId) {
		super();
		this.conceptId = conceptId;
		this.conceptName = conceptName;
		this.description = description;
		this.topicId = topicId;
	}

	public ConceptDTO(int conceptId, String conceptName, String topicId) {
		super();
		this.conceptId = conceptId;
		this.conceptName = conceptName;
		this.topicId = topicId;
	}

	public int getConceptId() {
		return conceptId;
	}

	public void setConceptId(int conceptId) {
		this.conceptId = conceptId;
	}

	public String getConceptName() {
		return conceptName;
	}

	public void setConceptName(String conceptName) {
		this.conceptName = conceptName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

}
