package com.zapper.webapp.lzres.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zapper.webapp.lzres.query.QuizDisplaySQL;
import com.zapper.webapp.lzres.utility.JdbcConnection;

public class QuizDisplayDAO {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public int returnQuizDisplaySummary(int userId) throws ClassNotFoundException, SQLException {
		try {
			con = JdbcConnection.getConnection();
			ps = con.prepareStatement(QuizDisplaySQL.GET_CONCEPT_ID);
			ps.setInt(1, userId);
			
			rs = ps.executeQuery();
			
			rs.next();
			return rs.getInt(1);
			
		}finally {
			JdbcConnection.closeConnection(rs, ps, con);
		}
	}

}
