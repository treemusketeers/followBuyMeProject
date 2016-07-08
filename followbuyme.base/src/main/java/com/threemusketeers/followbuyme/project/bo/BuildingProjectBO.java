
package com.threemusketeers.followbuyme.project.bo;

import com.followbuyme.project.model.BuildingProject;
import com.threemusketeers.followbuyme.base.bo.BaseBO;
import com.threemusketeers.followbuyme.document.model.Document;

/**
 * -------------------------------------------------
 * @ClassName:	BuildingProjectBO.java
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
public interface BuildingProjectBO extends BaseBO<BuildingProject>{
	public void addDocument(Document document, BuildingProject buildingProject) throws Exception;
}
