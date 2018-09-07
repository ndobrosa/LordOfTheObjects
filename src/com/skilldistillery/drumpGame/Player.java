package com.skilldistillery.drumpGame;

public class Player extends Person {

	private double weight;
	private double height;

	// constructors
	public Player() {
	}

	public Player(String name, int age) {
		super(name, age);
	}

	public Player(String name, int age, double weight, double height) {
		super(name, age);
		this.weight = weight;
		this.height = height;
	}

	// setters and getters
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculateBMI() {
		double bmi = (weight / (height * height)) * 703;

		return bmi;
	}

	@Override
	public String getInfo() {
		String info = "Hi. I'm " + getName() + " and I'm " + getAge() + " years old.\n";
		info += "I'm " + height + " inches tall, I weigh " + weight + " pounds and my BMI is " + calculateBMI();

		return info;
	}
}