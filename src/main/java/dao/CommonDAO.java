package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonDAO {
	protected final String DRIVER_NAME = "com.mysql.jdbc.Driver";

	protected final String JDBC_URL = "";
	protected final String DB_USER = "";
	protected final String DB_PASS = "";

	protected Connection conn;

	protected void getConnection() throws ClassNotFoundException, SQLException{
		Class.forName(DRIVER_NAME);
		conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
	}

	protected void closeConnection(){
		if(conn != null){
			try{
				conn.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}
