package com.zapper.webapp.lzres.query;

import com.zapper.webapp.lzres.utility.DbConst;
import com.zapper.webapp.lzres.utility.Property;
import com.zapper.webapp.lzres.utility.TableName;

public interface ConceptSQL {

	String GET_QDETAILS_CDETAILS_TID = ""
			+ " SELECT `concept_id`, `text`, `have_link`, `link_text`, `is_completed`,"
			+ " `is_locked`, `text`, `have_link`, `link_text`, `is_link_action_go_to`,"
			+ "	`is_link_action_pop_up`, `link_url`, `popup_message`, name, topic_id"
			+ "	FROM "+ Property.getProperty(DbConst.TESTSCOREDB)+ "."+ Property.getProperty(TableName.QUIZ_DISPLAY_SUMMARY_TB)
			+ "		NATURAL JOIN "+ Property.getProperty(DbConst.CONTENTDB)+ "."+ Property.getProperty(TableName.CONCEPT_TB)
			+ "	WHERE user_id = ?"
			+ "	ORDER BY concept_id, topic_id;";

}
