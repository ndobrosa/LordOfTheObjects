package com.skilldistillery.drumpGame;

public class Person {
	private String name;
	private int age;

	// constructors
	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// setters and getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getInfo() {
		return "Im not an absract person";
	}

}
