package com.gmail.oturisme;

public class Student extends Human {
	private long zachet;
	private String group;

	public Student(String name, String lastname, int age, boolean sex, long zachet, String group) {
		super(name, lastname, age, sex);
		this.zachet = zachet;
		this.group = group;
	}

	public Student() {
		super();
	}

	public long getZachet() {
		return zachet;
	}

	public void setZachet(long zachet) {
		this.zachet = zachet;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "Student [zachet=" + zachet + ", group=" + group + super.toString();
	}

}
