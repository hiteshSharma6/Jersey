package com.zapper.webapp.lzres.model.quizEvaluate;

public class RemarkDTO {
	
	private String text;
	private boolean haveLink;
	private String linkText;
	private boolean isLinkActionGoto;
	private boolean isLinkActionPopUp;
	private String linkUrl;
	private String popupMessage;

	public RemarkDTO() {
		super();
	}

	public RemarkDTO(String text, boolean haveLink, String linkText, boolean isLinkActionGoto,
			boolean isLinkActionPopUp, String linkUrl, String popupMessage) {
		super();
		this.text = text;
		this.haveLink = haveLink;
		this.linkText = linkText;
		this.isLinkActionGoto = isLinkActionGoto;
		this.isLinkActionPopUp = isLinkActionPopUp;
		this.linkUrl = linkUrl;
		this.popupMessage = popupMessage;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isHaveLink() {
		return haveLink;
	}

	public void setHaveLink(boolean haveLink) {
		this.haveLink = haveLink;
	}

	public String getLinkText() {
		return linkText;
	}

	public void setLinkText(String linkText) {
		this.linkText = linkText;
	}

	public boolean isLinkActionGoto() {
		return isLinkActionGoto;
	}

	public void setLinkActionGoto(boolean isLinkActionGoto) {
		this.isLinkActionGoto = isLinkActionGoto;
	}

	public boolean isLinkActionPopUp() {
		return isLinkActionPopUp;
	}

	public void setLinkActionPopUp(boolean isLinkActionPopUp) {
		this.isLinkActionPopUp = isLinkActionPopUp;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getPopupMessage() {
		return popupMessage;
	}

	public void setPopupMessage(String popupMessage) {
		this.popupMessage = popupMessage;
	}

}
