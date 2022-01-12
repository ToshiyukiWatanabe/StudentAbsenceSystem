package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Teacher;

public class TeacherDAO extends CommonDAO {

	public boolean register(String loginId, String familyName, String givenName, String course, String first, String second, String third, String password){
		try {
			getConnection();

			String sql = "INSERT INTO teacher(loginId, familyName, givenName, course, first, second, third, password) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
			// java.sql.PreparedStatementクラスを利用することでSQLインジェクションを防ぐ
			PreparedStatement pSmt = conn.prepareStatement(sql);

			pSmt.setString(1, loginId);
			pSmt.setString(2, familyName);
			pSmt.setString(3, givenName);
			pSmt.setString(4, course);
			pSmt.setString(5, first);
			pSmt.setString(6, second);
			pSmt.setString(7, third);
			pSmt.setString(8, password);
			int num = pSmt.executeUpdate();

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

	public Teacher findAccount(String loginId, String password) {
		Teacher teacher = new Teacher();
		try {
			getConnection();

			String sql ="SELECT loginId, password, familyName, givenName FROM teacher WHERE loginId=? AND password=?";
			PreparedStatement pSmt = conn.prepareStatement(sql);

			pSmt.setString(1, loginId);
			pSmt.setString(2, password);

			ResultSet rs = pSmt.executeQuery();

			if(!(rs.next())) {
				return null;
			}

			teacher.setLoginId(rs.getString("loginId"));
			teacher.setPassword(rs.getString("password"));
			teacher.setFamilyName(rs.getString("familyName"));
			teacher.setGivenName(rs.getString("givenName"));
			return teacher;

		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return teacher;
	}
}
