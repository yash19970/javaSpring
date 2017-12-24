package com.gontuseries.studentadmissioncontroller;

public class Student {
	private String studentName;
	private String studentHobby;
	private long studentMobile;
	
	
	public long getStudentMobile() {
		return studentMobile;
	}
	
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentHobby() {
		return studentHobby;
	}

	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
}
