package model;

import java.io.Serializable;

public class Teacher implements Serializable {
	private int id;
	private String familyName;
	private String givenName;
	private String password;

	public Teacher() {
	}

	public Teacher(int id, String familyName, String givenName, String password) {
		this.id = id;
		this.familyName = familyName;
		this.givenName = givenName;
		this.password = password;
	}

	public int getId() {
		return id;
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


}
