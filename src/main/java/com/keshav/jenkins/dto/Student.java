package com.keshav.jenkins.dto;

public class Student {
	int studentId;
	String name;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Student() {
	}
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
