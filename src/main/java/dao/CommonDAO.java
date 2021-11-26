package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CommonDAO {
	protected final String DRIVER_NAME = "com.mysql.jdbc.Driver";

	protected final String JDBC_URL = "jdbc:mysql://localhost:3306/sasdb";
	protected final String DB_USER = "root";
	protected final String DB_PASS = "B10n-T4w";

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
