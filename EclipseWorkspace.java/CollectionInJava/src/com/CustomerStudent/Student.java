package com.CustomerStudent;

public class Student {
	private String name;
	private int roll_no;
	private int age;
	public Student(String name, int roll_no, int age) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
