/**
 * 
 */
package com.threemusketeers.followbuyme.message.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * -------------------------------------------------
 * @ClassName:	Answer.java
 * @Copyright   2014 Yachin & Dan Software Solutions - ISRAEL.
 * @Project: Building Book
 * @Description:	 
 * @Author:	Yachin Elul
 * @Date:	13 בדצמ 2014
 *
 * @ChangesHistory:
 * -------------------------------------------------
 *	Ch#  	Date       	Programmer       Description
 * -------------------------------------------------
 */
@Entity
@Table(name = "ANSWER", catalog = "building")
public class Answer extends Message{

	
	private static final long serialVersionUID = -3867213989930453723L;
	private Long customerId = null;
	private Long questionId = null;
	private String answerContent = null;
	
	
	public Answer(Long buildingProjectId, Date creationDate, String content, MessageType type) {
		super(buildingProjectId, creationDate, content, type);
		// TODO Auto-generated constructor stub
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Long questionId) {
		this.questionId = questionId;
	}

	public String getAnswerContent() {
		return answerContent;
	}

	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	
	

}
