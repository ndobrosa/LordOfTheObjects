package oldFiles;

import java.util.Scanner;


public class Question {
	Scanner sc = new Scanner(System.in);
	int a;
//	private String[] questions = new String[10];
//	{
////	questions[0] = "What is your name?";
////	questions[1] = "How old are you?";
////	questions[2] = "What is your favorite country";
//	}
	
	
	public void question1() {
		System.out.println("What is your favorite country?");
		System.out.println("1.Mexico\n2.Russia\n3.North Korea\n4.Germany");
		a = sc.nextInt();
		
		if (a == 1) {
			drump.increaseApproval(3);
		}
		else if (a == 2) {
			drump.decreaseApproval(6);
		}
		else if (a == 3) {
			drump.increaseApproval(1);
		}
		else {
			drump.decreaseApproval(20);
			
		}
		
	}
	public void question2() {
		System.out.println("What is your favorite food?");
		System.out.println("1.Italian\n2.Mexican\n3.Spanish\n4.McDonald's");
		a = sc.nextInt();
		
		if (a == 1) {
			drump.increaseApproval(7)
		}
		else if (a == 2) {
			drump.decreaseApproval(2)
		}
		else if (a == 3) {
			drump.decreaseApproval(10)
		}
		else {
			drump.increaseApproval(20)
			
		}
		
	}
}
