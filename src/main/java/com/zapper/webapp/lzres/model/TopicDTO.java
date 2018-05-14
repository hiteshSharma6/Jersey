package com.zapper.webapp.lzres.model;

public class TopicDTO {
	
	private String topicId;
	private String topicName;
	private boolean showScoreTrendColumn;
	private boolean showRemarksColumn;

	public TopicDTO() {
		super();
	}

	public TopicDTO(String topicId, String topicName, boolean showScoreTrendColumn, boolean showRemarksColumn) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.showScoreTrendColumn = showScoreTrendColumn;
		this.showRemarksColumn = showRemarksColumn;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public boolean isShowScoreTrendColumn() {
		return showScoreTrendColumn;
	}

	public void setShowScoreTrendColumn(boolean showScoreTrendColumn) {
		this.showScoreTrendColumn = showScoreTrendColumn;
	}

	public boolean isShowRemarksColumn() {
		return showRemarksColumn;
	}

	public void setShowRemarksColumn(boolean showRemarksColumn) {
		this.showRemarksColumn = showRemarksColumn;
	}

}
