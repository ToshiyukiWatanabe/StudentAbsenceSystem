package model;

import java.io.Serializable;

public class User implements Serializable {

	private String id;
	private String familyName;
	private String givenName;
	private String cource;
	private String grade;
	private String password;

	public User(String id, String familyName, String givenName, String cource, String grade, String password) {
		this.id = id;
		this.familyName = familyName;
		this.givenName = givenName;
		this.cource = cource;
		this.grade = grade;
		this.password = password;
	}


	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}


	public String getId() {
		return id;
	}

	public String getFamilyName() {
		return familyName;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getCource() {
		return cource;
	}

	public String getGrade() {
		return grade;
	}

	public String getPassword() {
		return password;
	}




}
