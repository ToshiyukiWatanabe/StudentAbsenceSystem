package model;

import java.io.Serializable;

public class Subject implements Serializable {
	private int id;
	private String subject;
	private int lecturer;
	private String place;

	public Subject() {
	}

	public Subject(int id, String subject, int lecturer, String place) {
		this.id = id;
		this.subject = subject;
		this.lecturer = lecturer;
		this.place = place;
	}

	public int getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

	public int getLecturer() {
		return lecturer;
	}

	public String getPlace() {
		return place;
	}




}
