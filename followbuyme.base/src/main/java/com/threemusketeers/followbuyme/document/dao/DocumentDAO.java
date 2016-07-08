/**
 * 
 */
package com.threemusketeers.followbuyme.document.dao;

import java.io.InputStream;

import com.threemusketeers.followbuyme.base.dao.BaseDAO;
import com.threemusketeers.followbuyme.document.model.Document;

/**
 * -------------------------------------------------
 * @ClassName:	DocumentDAO.java
 * @Copyright   2014 Yachin & Dan Software Solutions - ISRAEL.
 * @Project: Building Book
 * @Description:	 
 * @Author:	Yachin Elul
 * @Date:	7 בינו 2015
 *
 * @ChangesHistory:
 * -------------------------------------------------
 *	Ch#  	Date       	Programmer       Description
 * -------------------------------------------------
 */
public interface DocumentDAO extends BaseDAO<Document> {
	
	public String createContent(InputStream content, String fileName, String contentType) throws Exception;
	public void deleteContent(String id) throws Exception;

}
