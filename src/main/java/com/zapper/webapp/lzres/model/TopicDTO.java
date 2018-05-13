package com.zapper.webapp.lzres.model;

public class TopicDTO {
	
	private String id;
	private String name;
	private boolean showScoreTrendColumn;
	private boolean showRemarksColumn;

	public TopicDTO() {
		super();
	}

	public TopicDTO(String id, String name, boolean showScoreTrendColumn, boolean showRemarksColumn) {
		super();
		this.id = id;
		this.name = name;
		this.showScoreTrendColumn = showScoreTrendColumn;
		this.showRemarksColumn = showRemarksColumn;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
