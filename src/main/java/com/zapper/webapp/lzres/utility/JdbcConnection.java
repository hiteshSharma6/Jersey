package com.zapper.webapp.lzres.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnection {
		
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(Property.getProperty(DbConstants.DRIVER_NAME));
		Connection con = DriverManager.getConnection(Property.getProperty(DbConstants.URL),
				Property.getProperty(DbConstants.USERNAME),
				Property.getProperty(DbConstants.PASSWORD));
		System.out.println(con.getCatalog());
		return con;
		
	}
	
	public static void closeConnection(ResultSet rs, PreparedStatement ps, Connection con) throws SQLException {
		
		if(rs != null) {
			rs.close();
		}
		if(ps != null) {
			ps.close();
		}
		if(con != null) {
			con.close();
		}
		
	}

}
