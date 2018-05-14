package com.zapper.webapp.lzres.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

import com.zapper.webapp.lzres.model.TopicDTO;
import com.zapper.webapp.lzres.query.TopicSQL;
import com.zapper.webapp.lzres.utility.JdbcConnection;

public class TopicDAO {
	
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	public List<TopicDTO> returnAllTopicSummary(SortedSet<String> allTopicsId) throws SQLException, ClassNotFoundException {
		
		try {
			con = JdbcConnection.getConnection();
			ps = con.prepareStatement(TopicSQL.GET_TOPIC_SUMMARY);
			
			List<TopicDTO> topicsList = new ArrayList<>();
			for(String topicId : allTopicsId) {
				ps.setString(1, topicId);
				
				rs = ps.executeQuery();
				if(rs.next())
					topicsList.add(new TopicDTO(topicId, rs.getString("topic_name"), rs.getBoolean("show_score_trend_column"), rs.getBoolean("show_remarks_column")));
			}
			
			if(topicsList.size() == 0)
				return null;
			return topicsList;
			
		}finally {
			JdbcConnection.closeConnection(rs, ps, con);
		}
		
	}

}
