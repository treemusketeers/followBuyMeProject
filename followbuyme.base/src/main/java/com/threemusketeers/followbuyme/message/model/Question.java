/**
 * 
 */
package com.threemusketeers.followbuyme.message.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * -------------------------------------------------
 * @ClassName:	Question.java
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
@Table(name = "QUESTION", catalog = "building")
public class Question extends Message {

	
	private static final long serialVersionUID = 5259104522573978915L;

	
	public Question() {
		super();
	}


	public Question(Long buildingProjectId, Date creationDate, String content,MessageType type) {
		super(buildingProjectId, creationDate, content, type);
		// TODO Auto-generated constructor stub
	}

}
