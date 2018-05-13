package com.zapper.webapp.lzres.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zapper.webapp.lzres.query.ConceptSQL;
import com.zapper.webapp.lzres.utility.JdbcConnection;

public class ConceptDAO {
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public String returnTopicId(int conceptId) throws ClassNotFoundException, SQLException {
		try {
			con = JdbcConnection.getConnection();
			ps = con.prepareStatement(ConceptSQL.GET_TOPIC_ID);
			ps.setInt(1, conceptId);
			
			rs = ps.executeQuery();
			
			rs.next();
			return rs.getString(1);
			
		}finally {
			JdbcConnection.closeConnection(rs, ps, con);
		}
	}

}
