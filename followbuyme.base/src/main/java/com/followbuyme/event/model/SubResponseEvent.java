/**
 * 
 */
package com.followbuyme.event.model;

import com.followbuyme.personaldetails.model.OpinionEnum;

/**
 * @author Yachin
 *
 */
public class SubResponseEvent {
	
	private Long id;
	private String comment;
	private Long pubEventId;
	private OpinionEnum opinion;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Long getPubEventId() {
		return pubEventId;
	}
	public void setPubEventId(Long pubEventId) {
		this.pubEventId = pubEventId;
	}
	public OpinionEnum getOpinion() {
		return opinion;
	}
	public void setOpinion(OpinionEnum opinion) {
		this.opinion = opinion;
	}
	
}
