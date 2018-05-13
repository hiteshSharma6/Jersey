package com.zapper.webapp.lzres.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zapper.webapp.lzres.query.EvaluationSQL;
import com.zapper.webapp.lzres.utility.JdbcConnection;

public class EvaluationDAO {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public String returnEvaluationId(String topicId, int conceptId) throws ClassNotFoundException, SQLException {
		
		try {
			con = JdbcConnection.getConnection();
			ps = con.prepareStatement(EvaluationSQL.GET_EVALUATION_ID);
			ps.setString(1, topicId);
			ps.setInt(2, conceptId);
			
			rs = ps.executeQuery();
			
			rs.next();
			return rs.getString(1);
			
		}finally {
			JdbcConnection.closeConnection(rs, ps, con);
		}
		
	}

}
