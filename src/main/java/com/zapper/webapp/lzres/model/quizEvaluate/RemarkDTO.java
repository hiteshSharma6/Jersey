package com.zapper.webapp.lzres.model.quizEvaluate;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "text", "haveLink", "linkText", "isLinkActionGoTo", "isLinkActionPopUp", "linkUrl", "popupMessage" })
public class RemarkDTO {
	
	private String text;
	private boolean haveLink;
	private String linkText;
	private boolean isLinkActionGoTo;
	private boolean isLinkActionPopUp;
	private String linkUrl;
	private String popupMessage;

	public RemarkDTO() {
		super();
	}

	public RemarkDTO(String text, boolean haveLink, String linkText, boolean isLinkActionGoTo,
			boolean isLinkActionPopUp, String linkUrl, String popupMessage) {
		super();
		this.text = text;
		this.haveLink = haveLink;
		this.linkText = linkText;
		this.isLinkActionGoTo = isLinkActionGoTo;
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

	public boolean getHaveLink() {
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

	public boolean getIsLinkActionGoto() {
		return isLinkActionGoTo;
	}

	public void setIsLinkActionGoto(boolean isLinkActionGoTo) {
		this.isLinkActionGoTo = isLinkActionGoTo;
	}

	public boolean getIsLinkActionPopUp() {
		return isLinkActionPopUp;
	}

	public void setIsLinkActionPopUp(boolean isLinkActionPopUp) {
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
