/**
 * 
 */
package com.threemusketeers.followbuyme.document.dao.impl;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



//import com.buildingbook.building.mongodb.dao.FileStorageDao;
//import com.mongodb.gridfs.GridFSDBFile;
import com.threemusketeers.followbuyme.base.dao.impl.BaseDAOImpl;
import com.threemusketeers.followbuyme.document.dao.DocumentDAO;
import com.threemusketeers.followbuyme.document.model.Document;

/**
 * -------------------------------------------------
 * @ClassName:	DocumentDAOImpl.java
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
@Repository("documentDAO")
public class DocumentDAOImpl extends BaseDAOImpl<Document> implements DocumentDAO {

	//@Autowired
	//FileStorageDao fileStorageDao;
	
	@Override
	public void create(Document input) throws Exception {
		String contentId = null;
		try{
			if(input.getContent() != null){
				contentId = createContent(input.getContent(), input.getName(), input.getType().toString());
				input.setContentId(contentId);
			}
			super.create(input);
		}catch(Exception e){
			if(contentId != null){ // In case of creating document failed, rollback the content.
				//fileStorageDao.delete(contentId);
			}
		}
	}

	@Override
	public void update(Document input) throws Exception {
		super.update(input);
		
	}

	@Override
	public void delete(Long id, Class<?> clazz) throws Exception {
		
		Document document = super.retrieveById(id);
		if(document != null && document.getContentId() != null){
			deleteContent(document.getContentId());
		}
		super.delete(document.getId(), Document.class);
		
	}

	@Override
	public Document retrieveById(Long id) throws Exception {
		
		Document document = super.retrieveById(id);
		if(document != null && document.getContentId() != null){
			//GridFSDBFile byId = fileStorageDao.getById(document.getContentId());
			//document.setContent(byId.getInputStream());
		}

		return document;
	}

	/*@Override
	public String createContent(InputStream content, String fileName, String contentType) throws Exception {
		
		String contentId = null;
		
		if(content != null){
			//contentId = fileStorageDao.store(content, fileName, contentType, null);
		}
		return contentId;
	}*/
	
	/*@Override
	public void deleteContent(String id) throws Exception {
		
		//fileStorageDao.delete(id);
	}*/

	public String createContent(InputStream content, String fileName,
			String contentType) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteContent(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
