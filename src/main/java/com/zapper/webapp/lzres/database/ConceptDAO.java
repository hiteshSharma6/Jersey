package com.zapper.webapp.lzres.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zapper.webapp.lzres.model.ConceptDTO;
import com.zapper.webapp.lzres.query.ConceptSQL;
import com.zapper.webapp.lzres.utility.JdbcConnection;

public class ConceptDAO {
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public List<ConceptDTO> returnAllCNameAndTId(int[] allConceptIds) throws ClassNotFoundException, SQLException {
		try {
			con = JdbcConnection.getConnection();
			ps = con.prepareStatement(ConceptSQL.GET_CNAME_AND_TID);
			
			List<ConceptDTO> conceptsList = new ArrayList<>();
			for(int conceptId : allConceptIds) {
				ps.setInt(1, conceptId);
				
				rs = ps.executeQuery();
				if(rs.next()) {
					conceptsList.add(new ConceptDTO(conceptId, rs.getString("name"), rs.getString("topic_id")));
				}
				
			}
			
			if(conceptsList.size() == 0)
				return null;
			return conceptsList;
			
		}finally {
			JdbcConnection.closeConnection(rs, ps, con);
		}
	}

}
