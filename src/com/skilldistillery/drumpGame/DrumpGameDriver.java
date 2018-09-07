package com.skilldistillery.drumpGame;

import java.util.Scanner;

public class DrumpGameDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Question qs = new Question();
		DrumpGameDriver game = new DrumpGameDriver();

		System.out.println("1. Play \n2. Exit");
		int choice = sc.nextInt();

		while (choice == 1) {
				double bmi = game.intro();
				if (bmi > 25) {
					System.out.println(
							"After careful consideration of your BMI and name origin the \"president's attorney\" decided you do not qualify for meeting the president.");
					choice = 2;
				}

			if (choice != 2) {
				System.out.println("\nYou are at the party, talking with the president. The president wants to ask you a few question to help him decide if you are the right model... I mean person... for him. Let's see if he likes what he hears.\n");
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
					System.out.println(
							"You win. You will now be able to bring your parents from Eastern Europe. You will live in happily ever after in a Mannhattan penthouse with interior made out of gold.");
				} else {
					System.out.println(
							"You lost your one opportunity to marry the greatest president god ever created. This may be a good time to start writing a book about the time you met The Drump.");
				}

			}
		System.out.println("Would you like to play again?\n1. Play \n2. Exit");	
		choice = sc.nextInt();
		}
	}


	public double intro() {
		Scanner sc = new Scanner(System.in);
		Player pl = new Player();
		System.out.println("Rules: This game is a realistic love-at-first-sight simulation. If the supreme leader gives you a higher dissaproval rating than 30, you lose the opportunity become his first, or well, fifth lady. \nWARNING: Many get emotinally attached to the Super President's character. His conduct can be very touching, borderline grabbing really!\n\n");
		System.out.println(
				"STORY: You are a very lucky lady. The SuperPresident Ronald Drump Jr. invited you to a swimsuit party. This is your one chance to impress the president of the World, who is also a stable genious. You are required to answer a few reasonable questions prior to attending. \nPlease enter your name: ");
		pl.setName(sc.nextLine());
		System.out.println("Enter your height in feet and inches.");
		System.out.print("Feet: ");
		int feet = sc.nextInt();
		System.out.print("Inches: ");
		int inches = sc.nextInt();
		double height = (double) feet * 12 + inches;
		pl.setHeight(height);
		System.out.println("Enter your weight: ");
		pl.setWeight(sc.nextDouble());
		double bmi = pl.calculateBMI();
		return bmi;
	}

}