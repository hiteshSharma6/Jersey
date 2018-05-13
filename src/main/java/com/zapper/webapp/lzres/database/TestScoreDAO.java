package com.zapper.webapp.lzres.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zapper.webapp.lzres.model.quizEvaluate.ScoreDTO;
import com.zapper.webapp.lzres.query.TestScoreSQL;
import com.zapper.webapp.lzres.utility.JdbcConnection;

public class TestScoreDAO {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public List<ScoreDTO> returnQuizWiseScore(int userId, String evaluationId) throws ClassNotFoundException, SQLException {
		
		try {
			
			con = JdbcConnection.getConnection();
			ps = con.prepareStatement(TestScoreSQL.GET_QUIZ_WISE_SCORE);
			ps.setInt(1, userId);
			ps.setString(2, evaluationId);
			rs = ps.executeQuery();
			
			List<ScoreDTO> score = new ArrayList<>();
			
			if(!rs.isBeforeFirst()) {
				return null;
			}else {
				while(rs.next()) {
					score.add(new ScoreDTO(rs.getString(1), rs.getString(2), rs.getString(3)));
				}
			}
			
			return score;
			
		}finally {
			JdbcConnection.closeConnection(rs, ps, con);
		}
		
	}

}
