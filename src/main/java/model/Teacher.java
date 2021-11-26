package model;

import java.io.Serializable;

public class Teacher implements Serializable {
	private String id;
	private String familyName;
	private String givenName;
	private String course;
	private String first;
	private String second;
	private String third;
	private String password;

	public Teacher() {
	}

	public Teacher(String id, String familyName, String givenName, String course, String first, String second,
			String third, String password) {
		this.id = id;
		this.familyName = familyName;
		this.givenName = givenName;
		this.course = course;
		this.first = first;
		this.second = second;
		this.third = third;
		this.password = password;
	}

	public Teacher(String id, String password) {
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


}
