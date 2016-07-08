/**
 * 
 */
package com.threemusketeers.followbuyme.base.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * -------------------------------------------------
 * @ClassName:	Base.java
 * @Copyright   2014 Yachin & Dan Software Solutions - ISRAEL.
 * @Project: Building Book
 * @Description:	 
 * @Author:	Yachin Elul
 * @Date:	14 בדצמ 2014
 *
 * @ChangesHistory:
 * -------------------------------------------------
 *	Ch#  	Date       	Programmer       Description
 * -------------------------------------------------
 */
@MappedSuperclass
public abstract class Base implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1061604824266672666L;
	
	
	@Version
	@Column(name = "VERSION")
	private Long version;
	
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public abstract Long getId();

	
	
	
	
}
