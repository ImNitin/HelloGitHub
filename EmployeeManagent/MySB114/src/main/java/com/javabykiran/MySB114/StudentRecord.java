package com.javabykiran.MySB114;

public class StudentRecord {

	int id;
	String name;
	String marks;
	
	StudentRecord(){}
	
	@Override
	public String toString() {
		return "StudentRecord [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	public StudentRecord(int id, String name, String marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
}
