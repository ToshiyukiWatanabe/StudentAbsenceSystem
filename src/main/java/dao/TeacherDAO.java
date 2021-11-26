package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TeacherDAO extends CommonDAO {

	public boolean register(String id, String familyName, String givenName, String course, String first, String second, String third, String password){
		try {
			getConnection();

			String sql = "INSERT INTO teacher(id, familyName, givenName, course, first, second, third, password) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
			// java.sql.PreparedStatementクラスを利用することでSQLインジェクションを防ぐ
			PreparedStatement psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, familyName);
			psmt.setString(3, givenName);
			psmt.setString(4, course);
			psmt.setString(5, first);
			psmt.setString(6, second);
			psmt.setString(7, third);
			psmt.setString(8, password);
			int num = psmt.executeUpdate();

			if(num == 1) {
				return true;
			} else {
				return false;
			}
		} catch(SQLException e) {
			e.printStackTrace();
			return false;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} finally {
			closeConnection();
		}
	}
}
