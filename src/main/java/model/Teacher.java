package model;

import java.io.Serializable;

public class Teacher implements Serializable {
	private String loginId;
	private String familyName;
	private String givenName;
	private String course;
	private String first;
	private String second;
	private String third;
	private String password;

	public Teacher() {
	}

	public Teacher(String loginId, String familyName, String givenName, String course, String first, String second,
			String third, String password) {
		this.loginId = loginId;
		this.familyName = familyName;
		this.givenName = givenName;
		this.course = course;
		this.first = first;
		this.second = second;
		this.third = third;
		this.password = password;
	}

	public Teacher(String loginId, String password) {
		this.loginId = loginId;
		this.password = password;
	}
	/* getter */
	public String getLoginId() {
		return loginId;
	}

	public String getFamilyName() {
		return familyName;
	}


	public String getGivenName() {
		return givenName;
	}


	public String getCourse() {
		return course;
	}


	public String getFirst() {
		return first;
	}


	public String getSecond() {
		return second;
	}


	public String getThird() {
		return third;
	}

	public String getPassword() {
		return password;
	}

	/* setter */
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public void setSecond(String second) {
		this.second = second;
	}

	public void setThird(String third) {
		this.third = third;
	}

	public void setPassword(String password) {
		this.password = password;
	}




}
