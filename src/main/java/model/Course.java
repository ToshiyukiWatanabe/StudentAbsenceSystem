package model;

import java.io.Serializable;

public class Course implements Serializable {
	private int id;
	private String course;
	public Course() {
	}

	public Course(int id, String course) {
		this.id = id;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public String getCourse() {
		return course;
}


}
