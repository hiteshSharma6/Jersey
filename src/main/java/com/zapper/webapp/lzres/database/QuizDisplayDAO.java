package com.zapper.webapp.lzres.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zapper.webapp.lzres.model.QuizEvalSummary;
import com.zapper.webapp.lzres.model.quizEvaluate.RemarkDTO;
import com.zapper.webapp.lzres.query.QuizDisplaySQL;
import com.zapper.webapp.lzres.utility.JdbcConnection;

public class QuizDisplayDAO {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<QuizEvalSummary> returnAllConceptId(int userId) throws ClassNotFoundException, SQLException {
		try {
			con = JdbcConnection.getConnection();
			ps = con.prepareStatement(QuizDisplaySQL.GET_CONCEPT_ID);
			ps.setInt(1, userId);
			
			rs = ps.executeQuery();
			if(!rs.isBeforeFirst()) {
				return null;
			}
			
			List<QuizEvalSummary> quizzesEval = new ArrayList<>();
			while(rs.next()) {
				 quizzesEval.add(new QuizEvalSummary("", rs.getInt("column_id"), rs.getBoolean("is_locked"), rs.getBoolean("is_completed"), new RemarkDTO(rs.getString("text"), rs.getBoolean("have_link"), rs.getString("link_text"), rs.getBoolean("is_link_action_go_to"), rs.getBoolean("is_link_action_pop_up"), rs.getString("link_url"), rs.getString("popup_message")), null, null));
			}
			return quizzesEval;
			
		}finally {
			JdbcConnection.closeConnection(rs, ps, con);
		}
	}

}
