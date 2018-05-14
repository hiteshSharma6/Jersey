package com.zapper.webapp.lzres.query;

import com.zapper.webapp.lzres.utility.TableName;

public interface ConceptSQL {

	String GET_CNAME_AND_TID = ""
			+ "SELECT name, topic_id"
			+ "FROM "+ TableName.CONCEPT_TB
			+ "WHERE concept_id = ?";

}
