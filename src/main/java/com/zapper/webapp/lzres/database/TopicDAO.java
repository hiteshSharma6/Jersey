package com.zapper.webapp.lzres.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zapper.webapp.lzres.model.TopicDTO;
import com.zapper.webapp.lzres.query.TopicSQL;
import com.zapper.webapp.lzres.utility.JdbcConnection;

public class TopicDAO {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public TopicDTO returnTopicSummary(String topicId) throws SQLException, ClassNotFoundException {
		
		try {
			con = JdbcConnection.getConnection();
			ps = con.prepareStatement(TopicSQL.GET_TOPIC_SUMMARY);
			ps.setString(1, topicId);
			rs = ps.executeQuery();
			
			if(rs.isBeforeFirst()) {
				System.out.println("Empty Topic");
				return null;
			} else {
				rs.next();
				
				return new TopicDTO(topicId, rs.getString(2), rs.getBoolean(3), rs.getBoolean(4));
			}
			
		}finally {
			JdbcConnection.closeConnection(rs, ps, con);
		}
		
	}

}
