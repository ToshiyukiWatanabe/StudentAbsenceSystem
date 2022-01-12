package model;

import java.io.Serializable;

public class Lecturer implements Serializable {
	private String loginId;
	private String familyName;
	private String givenName;
	private String password;

	public Lecturer() {
	}

	public Lecturer(String loginId, String familyName, String givenName, String password) {
		this.loginId = loginId;
		this.familyName = familyName;
		this.givenName = givenName;
		this.password = password;
	}

	public String getLoginId() {
		return loginId;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getPassword() {
		return password;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
