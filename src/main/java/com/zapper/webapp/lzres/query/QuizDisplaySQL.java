package com.zapper.webapp.lzres.query;

import com.zapper.webapp.lzres.utility.TableName;

public interface QuizDisplaySQL {

	String GET_CONCEPT_ID = ""
			+ "	SELECT concept_id, text, have_link, link_text, is_link_action_go_to,"
			+ " is_link_action_pop_up, link_url, pop_up_message, is_locked, is_completed"
			+ "	FROM "+ TableName.QUIZ_DISPLAY_SUMMARY_TB
			+ "	WHERE user_id = ?";

}
