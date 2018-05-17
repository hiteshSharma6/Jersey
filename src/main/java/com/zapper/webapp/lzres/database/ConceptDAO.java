package com.zapper.webapp.lzres.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zapper.webapp.lzres.model.MyQuizzes;
import com.zapper.webapp.lzres.model.QuizEvalSummary;
import com.zapper.webapp.lzres.model.quizEvaluate.RemarkDTO;
import com.zapper.webapp.lzres.query.ConceptSQL;
import com.zapper.webapp.lzres.utility.JdbcConnection;

public class ConceptDAO {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public List<MyQuizzes> returnAllCDetailsAndTId(int userId) throws ClassNotFoundException, SQLException {
		try {
			con = JdbcConnection.getConnection();
			ps = con.prepareStatement(ConceptSQL.GET_QDETAILS_CDETAILS_TID);
			
			List<MyQuizzes> quizzesList = new ArrayList<>();
			ps.setInt(1, userId);
			System.out.println(quizzesList);
			rs = ps.executeQuery();
			while(rs.next()) {
				if(quizzesList.isEmpty()) {						
					quizzesList.add(new MyQuizzes(rs.getString("topic_id")));

				}
				int lastIndex = quizzesList.size()-1;
				if(!quizzesList.get(lastIndex).getTopicId().equals(rs.getString("topic_id"))) {
					quizzesList.add(new MyQuizzes(rs.getString("topic_id")));
				
				}
				quizzesList.get(lastIndex).getEvaluations().add(
						new QuizEvalSummary(rs.getString("name"), rs.getInt("concept_id"), rs.getBoolean("is_locked"), rs.getBoolean("is_completed"), 
								new RemarkDTO(rs.getString("text"), rs.getBoolean("have_link"), rs.getString("link_text"), 
										rs.getBoolean("is_link_action_go_to"), rs.getBoolean("is_link_action_pop_up"), 
										rs.getString("link_url"), rs.getString("popup_message")
										), 
								null, null)
						);
				
			}
				
			if(quizzesList.size() == 0)
				return null;
			return quizzesList;
			
		}finally {
			JdbcConnection.closeConnection(rs, ps, con);
		}
	}

}
