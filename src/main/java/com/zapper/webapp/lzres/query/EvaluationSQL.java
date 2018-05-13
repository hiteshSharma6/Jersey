package com.zapper.webapp.lzres.query;

import com.zapper.webapp.lzres.utility.TableName;

public interface EvaluationSQL {

	String GET_EVALUATION_ID = ""
			+ " SELECT evaluation_id"
			+ " FROM "+ TableName.EVALUATION_TB
			+ " WHERE ("
			+ "		topic_id = ?"
			+ "		AND concept_id = ?"
			+ " );";

}
