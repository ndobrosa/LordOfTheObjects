package com.skilldistillery.drumpGame;

import java.util.Scanner;

public class Question {

	Scanner sc = new Scanner(System.in);
	int a;
	President drump = new President();

//	public void introductionQuestions() {
//
//	}
	
	public void conclusion() {
		System.out.println("Your disapproval rate: " + drump.getDisapprovalRate());
		System.out.println("Your approval rate: " + drump.getApprovalRate());
        System.out.println();
	}

	public int question1() {
		System.out.println("What is your favorite country?");
		System.out.println("1.Mexico\n2.Russia\n3.North Korea\n4.Germany");

		a = sc.nextInt();

		if (a == 1) {
			drump.increaseDisapprovalRate(20);
			System.out.println("They are gonna pay for it, believe me. BUILD THE WALL! BUILD THE WALL!");
		} else if (a == 2) {
			drump.increaseApprovalRate(10);
			System.out.println(
					"I love russia, great people, beautiful women. I assume the food is good as well. Excellent choice!");
		} else if (a == 3) {
			drump.increaseApprovalRate(10);
			System.out.println("I always tell Kim, starving people make the best food.");
		} else {
			drump.increaseDisapprovalRate(10);
			System.out.println("The only thing worse than German food is the German chancellor!");

		}
//		System.out.println("Your disapproval rate: " + drump.getDisapprovalRate());
//		System.out.println("Your approval rate: " + drump.getApprovalRate());
//        System.out.println();
		conclusion();
		return (drump.getDisapprovalRate());

	}

	public int question2() {
        System.out.println("What is your favorite food?");
        System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
        a = sc.nextInt();

        if (a == 1) {
            drump.increaseApprovalRate(1);
            System.out.println("It’s OK. I guess...");
        } else if (a == 2) {
            drump.increaseDisapprovalRate(9);
            System.out.println(
                    "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
        } else if (a == 3) {
            drump.increaseDisapprovalRate(10);
            System.out.println(
                    "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
        } else {
            drump.increaseApprovalRate(20);
            System.out.println(
                    "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that movie star, Stormy, Stromae, or something...");

        }
        conclusion();
        return (drump.getDisapprovalRate());

    }

	public int question3() {
        System.out.println("What is your favorite food?");
        System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
        a = sc.nextInt();

        if (a == 1) {
            drump.increaseApprovalRate(1);
            System.out.println("It’s OK. I guess...");
        } else if (a == 2) {
            drump.increaseDisapprovalRate(9);
            System.out.println(
                    "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
        } else if (a == 3) {
            drump.increaseDisapprovalRate(10);
            System.out.println(
                    "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
        } else {
            drump.increaseApprovalRate(20);
            System.out.println(
                    "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");

        }
        conclusion();
        return (drump.getDisapprovalRate());

    }

public int question4() {
        System.out.println("What is your favorite food?");
        System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
        a = sc.nextInt();

        if (a == 1) {
            drump.increaseApprovalRate(1);
            System.out.println("It’s OK. I guess...");
        } else if (a == 2) {
            drump.increaseDisapprovalRate(9);
            System.out.println(
                    "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
        } else if (a == 3) {
            drump.increaseDisapprovalRate(10);
            System.out.println(
                    "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
        } else {
            drump.increaseApprovalRate(20);
            System.out.println(
                    "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");

        }
        conclusion();
        return (drump.getDisapprovalRate());

    }

	public int question5() {
        System.out.println("What is your favorite food?");
        System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
        a = sc.nextInt();

        if (a == 1) {
            drump.increaseApprovalRate(1);
            System.out.println("It’s OK. I guess...");
        } else if (a == 2) {
            drump.increaseDisapprovalRate(9);
            System.out.println(
                    "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
        } else if (a == 3) {
            drump.increaseDisapprovalRate(10);
            System.out.println(
                    "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
        } else {
            drump.increaseApprovalRate(20);
            System.out.println(
                    "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");

        }
        conclusion();
        return (drump.getDisapprovalRate());

    }

	public int question6() {
        System.out.println("What is your favorite food?");
        System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
        a = sc.nextInt();

        if (a == 1) {
            drump.increaseApprovalRate(1);
            System.out.println("It’s OK. I guess...");
        } else if (a == 2) {
            drump.increaseDisapprovalRate(9);
            System.out.println(
                    "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
        } else if (a == 3) {
            drump.increaseDisapprovalRate(10);
            System.out.println(
                    "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
        } else {
            drump.increaseApprovalRate(20);
            System.out.println(
                    "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");

        }
        conclusion();
        return (drump.getDisapprovalRate());

    }

public int question7() {
    System.out.println("What is your favorite food?");
    System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
    a = sc.nextInt();

    if (a == 1) {
        drump.increaseApprovalRate(1);
        System.out.println("It’s OK. I guess...");
    } else if (a == 2) {
        drump.increaseDisapprovalRate(9);
        System.out.println(
                "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
    } else if (a == 3) {
        drump.increaseDisapprovalRate(10);
        System.out.println(
                "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
    } else {
        drump.increaseApprovalRate(20);
        System.out.println(
                "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");

    }
    conclusion();
    return (drump.getDisapprovalRate());

}

	public int question8() {
        System.out.println("What is your favorite food?");
        System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
        a = sc.nextInt();

        if (a == 1) {
            drump.increaseApprovalRate(1);
            System.out.println("It’s OK. I guess...");
        } else if (a == 2) {
            drump.increaseDisapprovalRate(9);
            System.out.println(
                    "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
        } else if (a == 3) {
            drump.increaseDisapprovalRate(10);
            System.out.println(
                    "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
        } else {
            drump.increaseApprovalRate(20);
            System.out.println(
                    "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");

        }
        conclusion();
        return (drump.getDisapprovalRate());

    }

public int question9() {
    System.out.println("What is your favorite food?");
    System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
    a = sc.nextInt();

    if (a == 1) {
        drump.increaseApprovalRate(1);
        System.out.println("It’s OK. I guess...");
    } else if (a == 2) {
        drump.increaseDisapprovalRate(9);
        System.out.println(
                "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
    } else if (a == 3) {
        drump.increaseDisapprovalRate(10);
        System.out.println(
                "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
    } else {
        drump.increaseApprovalRate(20);
        System.out.println(
                "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");

    }
    conclusion();
    return (drump.getDisapprovalRate());

}

	public int question10() {
        System.out.println("What is your favorite food?");
        System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
        a = sc.nextInt();

        if (a == 1) {
            drump.increaseApprovalRate(1);
            System.out.println("It’s OK. I guess...");
        } else if (a == 2) {
            drump.increaseDisapprovalRate(9);
            System.out.println(
                    "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
        } else if (a == 3) {
            drump.increaseDisapprovalRate(10);
            System.out.println(
                    "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
        } else {
            drump.increaseApprovalRate(20);
            System.out.println(
                    "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");

        }
        conclusion();
        return (drump.getDisapprovalRate());

    }

}