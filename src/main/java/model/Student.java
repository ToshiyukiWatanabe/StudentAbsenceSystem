package model;

import java.io.Serializable;

public class Student implements Serializable {
	private int id;
	private String familyName;
	private String givenName;
	private String course;
	private int grade;
	private String password;

	public Student() {
	}

	public Student(int id, String familyName, String givenName, String course, int grade, String password) {
		this.id = id;
		this.familyName = familyName;
		this.givenName = givenName;
		this.course = course;
		this.grade = grade;
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

	public String getCourse() {
		return course;
	}

	public int getGrade() {
		return grade;
	}

	public String getPassword() {
		return password;
	}



}
