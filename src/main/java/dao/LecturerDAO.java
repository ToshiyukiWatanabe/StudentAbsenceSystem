package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Lecturer;

public class LecturerDAO extends CommonDAO {
	public boolean register(String loginId, String familyName, String givenName,String password) {
		try {
			getConnection();

			String sql = "INSERT INTO lecturer(loginId, familyName, givenName, password) VALUES(?, ?, ?, ?)";

			PreparedStatement pSmt = conn.prepareStatement(sql);

			pSmt.setString(1, loginId);
			pSmt.setString(2, familyName);
			pSmt.setString(3, givenName);
			pSmt.setString(4, password);

			int num = pSmt.executeUpdate();

			if(num == 1) {
				return true;
			} else  {
				return false;
			}

		}catch(SQLException e) {
			e.printStackTrace();
			return false;

		} catch(ClassNotFoundException e){
			e.printStackTrace();
			return false;

		}finally {
			closeConnection();
		}
	}

	public Lecturer findAccount(String loginId, String password) {
		Lecturer lecturer = new Lecturer();
		try {
			getConnection();

			String sql= "SELECT loginId, password, familyName, givenName FROM lecturer WHERE loginId=? AND password=? ";
			PreparedStatement pSmt = conn.prepareStatement(sql);

			pSmt.setString(1, loginId);
			pSmt.setString(2, password);

			ResultSet rs = pSmt.executeQuery();

			if(!rs.next()) {
				return null;
			}

			lecturer.setLoginId(rs.getString("loginId"));
			lecturer.setPassword(rs.getString("password"));
			lecturer.setFamilyName(rs.getString("familyName"));
			lecturer.setGivenName(rs.getString("givenName"));
			return lecturer;

		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
		return lecturer;
	}
}
