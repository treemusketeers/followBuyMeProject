/**
 * 
 */
package com.threemusketeers.followbuyme.message.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.threemusketeers.followbuyme.base.model.Base;

/**
 * -------------------------------------------------
 * @ClassName:	Message.java
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
@Table(name = "MESSAGE", catalog = "building")
public class Message extends Base{
	
	
	private static final long serialVersionUID = 6116958903441746540L;
	
	private Long id = null;
	private Long buildingProjectId = null;
	private Date creationDate = null;
	private String content = null;
	private MessageType type = null;
	
	
	public Message() {
		super();
	}

	public Message(Long buildingProjectId, Date creationDate, String content,
			MessageType type) {
		super();
		this.buildingProjectId = buildingProjectId;
		this.creationDate = creationDate;
		this.content = content;
		this.type = type;
	}
	
	public Long getBuildingProjectId() {
		return buildingProjectId;
	}
	public void setBuildingProjectId(Long buildingProjectId) {
		this.buildingProjectId = buildingProjectId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public MessageType getType() {
		return type;
	}
	public void setType(MessageType type) {
		this.type = type;
	}

	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
}
