package com.skilldistillery.drumpGame;

import java.util.Scanner;

public class DrumpGameDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Question qs = new Question();
		DrumpGameDriver game = new DrumpGameDriver();

		System.out.println("1. Play \n2. Exit");
		int choice = sc.nextInt();

		if (choice == 1) {
			double bmi = game.intro();
			if (bmi > 25) {
				System.out.println("Youre too fat. you lose");
				choice = 2;
			}
		}
		
		if (choice != 2) {

			int disRating = qs.question1();
			disRating = qs.question2();

			if (disRating < 30) {
				disRating = qs.question3();
			}
			if (disRating < 30) {
				disRating = qs.question4();
			}
			if (disRating < 30) {
				disRating = qs.question5();
			}
			if (disRating < 30) {
				disRating = qs.question6();
			}

			if (disRating < 30) {
				disRating = qs.question7();
			}
			if (disRating < 30) {
				disRating = qs.question8();
			}
			if (disRating < 30) {
				disRating = qs.question9();
			}
			if (disRating < 30) {
				disRating = qs.question10();
			}
			if (disRating < 30) {
				System.out.println("You win");
			} else {
				System.out.println("You lose");
			}

		}

	}

	public double intro() {
		Scanner sc = new Scanner(System.in);
		Player pl = new Player();

		System.out.println(
				"You are a very lucky lady. The SuperPresident Ronald Drump. Jr. invited you to a swimsuit party. This is your one chance to impress the president of the World, who is also a stable genious. You are required to answer a few reasonable questions prior to attending. \nPlease enter your name: ");
		pl.setName(sc.nextLine());
		System.out.println("Enter your height in feet and inches");
		System.out.print("Feet: ");
		int feet = sc.nextInt();
		System.out.print("Inches: ");
		int inches = sc.nextInt();
		double height = (double)()
		pl.setHeight(sc.nextDouble());
		System.out.println("Enter your weight: ");
		pl.setWeight(sc.nextDouble());
		double bmi = pl.calculateBMI();
		return bmi;
	}

}