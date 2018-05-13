package com.zapper.webapp.lzres.query;

import com.zapper.webapp.lzres.utility.TableName;

public interface ConceptSQL {

	String GET_TOPIC_ID = ""
			+ "SELECT concept_id"
			+ "FROM "+ TableName.CONCEPT_TB
			+ "WHERE topic_id = ?";

}
