package com.zapper.webapp.lzres.query;

import com.zapper.webapp.lzres.utility.DbConst;
import com.zapper.webapp.lzres.utility.Property;
import com.zapper.webapp.lzres.utility.TableName;

public interface TestScoreSQL {

	String GET_QUIZ_WISE_SCORE = ""
			+ "	SELECT evaluation_id, total_score, display_color"
			+ "	FROM "+ Property.getProperty(DbConst.TESTSCOREDB)+ "."+ Property.getProperty(TableName.TEST_SCORE_SUMMARY_TB)
			+ "	NATURAL JOIN ("
			+ "		SELECT evaluation_id"
			+ "		FROM CONTENTDB.EVALUATION"
			+ "		WHERE topic_id = ?"
			+ "	) AS EVAL;";

}
