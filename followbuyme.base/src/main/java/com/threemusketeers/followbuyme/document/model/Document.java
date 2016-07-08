/**
 * 
 */
package com.threemusketeers.followbuyme.document.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.InputStream;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.threemusketeers.followbuyme.base.model.Base;
import com.threemusketeers.followbuyme.document.enumeration.DocumentType;

/**
 * -------------------------------------------------
 * @ClassName:	Document.java
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
@Table(name = "DOCUMENT", catalog = "building")
public class Document extends Base{
	
	
	private static final long serialVersionUID = 3263346334281240032L;
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "DOCUMENT_ID", unique = true, nullable = false)
	private Long id = null;
	
	@Column(name = "NAME", unique = false, nullable = true, length = 10)
	private String name = null;
	
	@Column(name = "DOCUMENT_TYPE", unique = false, nullable = true, length = 10)
	private DocumentType type;
	
	@Column(name = "CONTENT_ID", unique = false, nullable = true)	
	private String contentId;
	
	
	@Transient
	private InputStream content;
	
	
	
	public Document() {
		super();
	}

	public Document(String name, DocumentType type) {
		super();
		this.name = name;
		this.type = type;
	}	
	
	public Document(String name, DocumentType type, InputStream content) {
		super();
		this.name = name;
		this.type = type;
		this.content = content;
	}
	
    	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
    
	public DocumentType getType() {
		return type;
	}
	public void setType(DocumentType type) {
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

	
	public String getContentId() {
		return contentId;
	}

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public InputStream getContent() {
		return content;
	}

	public void setContent(InputStream content) {
		this.content = content;
	}
	
	

}
