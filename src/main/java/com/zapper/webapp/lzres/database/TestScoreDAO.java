package com.zapper.webapp.lzres.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zapper.webapp.lzres.model.quizEvaluate.ScoreDTO;
import com.zapper.webapp.lzres.query.TestScoreSQL;
import com.zapper.webapp.lzres.utility.JdbcConnection;

public class TestScoreDAO {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;

	public Map<String, Map<Integer, List<ScoreDTO>>> returnQuizWiseScore(Map<Integer, String> conceptTopicMap) throws ClassNotFoundException, SQLException {
		
		try {
			
			con = JdbcConnection.getConnection();
			ps = con.prepareStatement(TestScoreSQL.GET_QUIZ_WISE_SCORE);
			
			Map<String, Map<Integer, List<ScoreDTO>>> scoreQuizMap = new HashMap<>();
			for(Map.Entry<Integer, String> conceptTopic : conceptTopicMap.entrySet()) {
				String topicId = conceptTopic.getValue();
				
				ps.setString(1, topicId);
				rs = ps.executeQuery();
				
				List<ScoreDTO> quizScore = new ArrayList<>();
				while(rs.next()) {
					quizScore.add(new ScoreDTO(rs.getString("evaluation_id"), rs.getString("total_score"),
							rs.getString("display_color")));
				}
				
				if(scoreQuizMap.get(topicId) == null) {
					scoreQuizMap.put(topicId, new HashMap<Integer, List<ScoreDTO>>());
					System.out.println("NULL");

				}
				scoreQuizMap.get(topicId).put(conceptTopic.getKey(), quizScore);
			}
			
			return scoreQuizMap;
			
		}finally {
			JdbcConnection.closeConnection(rs, ps, con);
		}
		
	}

}
