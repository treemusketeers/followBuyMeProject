/**
 * 
 */
package com.threemusketeers.followbuyme.project.bo.impl;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.followbuyme.project.model.BuildingProject;
import com.threemusketeers.followbuyme.base.bo.impl.BaseBOImpl;
import com.threemusketeers.followbuyme.document.dao.DocumentDAO;
import com.threemusketeers.followbuyme.document.model.Document;
import com.threemusketeers.followbuyme.project.bo.BuildingProjectBO;
import com.threemusketeers.followbuyme.project.dao.BuildingProjectDAO;

/**
 * -------------------------------------------------
 * @ClassName:	BuildingProjectBOImpl.java
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
@Component("buildingProjectBO")
//@Service("stockBo")
public class BuildingProjectBOImpl extends BaseBOImpl<BuildingProject> implements BuildingProjectBO{

	@Autowired
	BuildingProjectDAO buildingProjectDAO;
	
	@Autowired
	DocumentDAO documentDAO;
	
	public void addDocument(Document document, BuildingProject buildingProject ) throws Exception{
		
		String contentId = null;
		try{
			if(document.getContent() != null){
				contentId = documentDAO.createContent(document.getContent(), document.getName(), document.getType().toString());
			}
			document.setContentId(contentId);
			if(buildingProject.getDocuments() !=null){
				buildingProject.getDocuments().add(document);
			}
			else{
				buildingProject.setDocuments(new ArrayList<Document>(Arrays.asList(document)));
			}
			buildingProjectDAO.update(buildingProject);
			
		
		}catch(Exception e){
			if(contentId != null){
				documentDAO.deleteContent(contentId);
			}
		}
	}
	
}
