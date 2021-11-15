package model;

import java.io.Serializable;
import java.sql.Date;

public class Timetable implements Serializable {
	private int id;
	private Date yearMonthDay;
	private int subject;

	public Timetable() {
	}
	public Timetable(int id, Date yearMonthDay, int subject) {
		this.id = id;
		this.yearMonthDay = yearMonthDay;
		this.subject = subject;
	}
	public int getId() {
		return id;
	}
	public Date getYearMonthDay() {
		return yearMonthDay;
	}
	public int getSubject() {
		return subject;
	}


}
