package com.zapper.webapp.lzres.query;

import com.zapper.webapp.lzres.utility.TableName;

public interface TopicSQL {

	String GET_TOPIC_SUMMARY = ""
			+ "	SELECT topic_name, show_score_trend_column, show_remarks_column"
			+ "	FROM "+ TableName.TOPIC_SUMMARY_TB
			+ "	WHERE topic_id = ?";

}
