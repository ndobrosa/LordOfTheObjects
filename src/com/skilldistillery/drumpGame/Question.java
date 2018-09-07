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
        System.out.println("As you know, I am the greatest public speaker of all time. Me, then Putin, then Cosby. All good guys.\nWhat is your favorite quote of mine?");
        System.out.println("1.\"Health care must be recognized as a right, not a privilege. Every man, woman and child in our country should be able to access the health care they need regardless of their income.\"\n2.\"I like China. I just sold an apartment to someone from China for $15 million. Am I supposed to dislike them?\"\n3.\"If Ivanka weren't my daughter, perhaps I'd be dating her.\"\n\"My IQ is one of the highest and you all know it. Please don't feel so stypid or insecure.\"");
        a = sc.nextInt();

        if (a == 1) {
            drump.increaseDisapprovalRate(20);
            System.out.println("You are not very smart. Let me explain. Funny thing, I don't get along with rich people. Poor people know that having healthcare is bad for them. They love me. Look at the polls Jared posted on Twitter, not the fake news.");
        } else if (a == 2) {
            drump.increaseApprovalRate(10);
            System.out.println(
                    "Next time I buy an apartment, China will pay for it.");
        } else if (a == 3) {
            drump.increaseDisapprovalRate(10);
            System.out.println(
                    "They still love me. I could walk out of the Drump Tower in Manhattan, great building, and shoot someont. They would still love me.");
        } else {
            drump.increaseApprovalRate(20);
            System.out.println("Sorry losers and haters, but that is the greatest quote of all time.");

        }
        conclusion();
        return (drump.getDisapprovalRate());

    }
//this one
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
        System.out.println("What do you think we should do with the southern border?");
        System.out.println("1.Build the wall\n2.Isn't the number of people crossing is decreasing anyway...\n3.We have bigger problems than the south border. Like healthcare and budget deficit.\n4. Make illegal immigrants build the wall, but from the Mexican side of the border. And then, make Mexico pay for it.");
        a = sc.nextInt();

        if (a == 1) {
            drump.increaseApprovalRate(10);
            System.out.println("I will build a great, great wall on our southern border, and I will have Mexico pay for that wall. Mark my words");
        } else if (a == 2) {
            drump.increaseDisapprovalRate(10);
            System.out.println(
                    "Thank you for noticing how effective my foreign policy is. I will continue making America great again, which means stopping them from entering.\nThey're bringing drugs. They're bringing crime. They're rapists. And some, I assume, are good people.");
        } else if (a == 3) {
            drump.increaseDisapprovalRate(10);
            System.out.println(
                    "When Mexico sends its people, they're not sending their best. They're not sending you. They're sending people that have lots of problems, and they're bringing those problems with us.");
        } else {
            drump.increaseApprovalRate(20);
            System.out.println("Brilliant. You should become my chief strategist! Can you start working tomorrow. I can show you a video of firing Steve Banon. It is great.");

        }
        conclusion();
        return (drump.getDisapprovalRate());

    }
//
//	public int question6() {
//        System.out.println("What is your favorite food?");
//        System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
//        a = sc.nextInt();
//
//        if (a == 1) {
//            drump.increaseApprovalRate(1);
//            System.out.println("It’s OK. I guess...");
//        } else if (a == 2) {
//            drump.increaseDisapprovalRate(9);
//            System.out.println(
//                    "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
//        } else if (a == 3) {
//            drump.increaseDisapprovalRate(10);
//            System.out.println(
//                    "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
//        } else {
//            drump.increaseApprovalRate(20);
//            System.out.println(
//                    "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");
//
//        }
//        conclusion();
//        return (drump.getDisapprovalRate());
//
//    }
//
//public int question7() {
//    System.out.println("What is your favorite food?");
//    System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
//    a = sc.nextInt();
//
//    if (a == 1) {
//        drump.increaseApprovalRate(1);
//        System.out.println("It’s OK. I guess...");
//    } else if (a == 2) {
//        drump.increaseDisapprovalRate(9);
//        System.out.println(
//                "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
//    } else if (a == 3) {
//        drump.increaseDisapprovalRate(10);
//        System.out.println(
//                "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
//    } else {
//        drump.increaseApprovalRate(20);
//        System.out.println(
//                "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");
//
//    }
//    conclusion();
//    return (drump.getDisapprovalRate());
//
//}
//
//	public int question8() {
//        System.out.println("What is your favorite food?");
//        System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
//        a = sc.nextInt();
//
//        if (a == 1) {
//            drump.increaseApprovalRate(1);
//            System.out.println("It’s OK. I guess...");
//        } else if (a == 2) {
//            drump.increaseDisapprovalRate(9);
//            System.out.println(
//                    "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
//        } else if (a == 3) {
//            drump.increaseDisapprovalRate(10);
//            System.out.println(
//                    "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
//        } else {
//            drump.increaseApprovalRate(20);
//            System.out.println(
//                    "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");
//
//        }
//        conclusion();
//        return (drump.getDisapprovalRate());
//
//    }
//
//public int question9() {
//    System.out.println("What is your favorite food?");
//    System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
//    a = sc.nextInt();
//
//    if (a == 1) {
//        drump.increaseApprovalRate(1);
//        System.out.println("It’s OK. I guess...");
//    } else if (a == 2) {
//        drump.increaseDisapprovalRate(9);
//        System.out.println(
//                "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
//    } else if (a == 3) {
//        drump.increaseDisapprovalRate(10);
//        System.out.println(
//                "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
//    } else {
//        drump.increaseApprovalRate(20);
//        System.out.println(
//                "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");
//
//    }
//    conclusion();
//    return (drump.getDisapprovalRate());
//
//}
//
//	public int question10() {
//        System.out.println("What is your favorite food?");
//        System.out.println("1.Italian\n2.Mexican\n3.Chinese\n4.McDonald’s");
//        a = sc.nextInt();
//
//        if (a == 1) {
//            drump.increaseApprovalRate(1);
//            System.out.println("It’s OK. I guess...");
//        } else if (a == 2) {
//            drump.increaseDisapprovalRate(9);
//            System.out.println(
//                    "They are sending some bad hombres. Imagine if we had open borders, taco trucks on every corner. Believe me.");
//        } else if (a == 3) {
//            drump.increaseDisapprovalRate(10);
//            System.out.println(
//                    "We don’t win anymore. China makes more rice than America, can you believe that? We should impose tarriffs on rice and tofu.");
//        } else {
//            drump.increaseApprovalRate(20);
//            System.out.println(
//                    "Real American, healthy food. My doctor said I have great genes, and my health is perfect. I didn’t even bribe him... that much... Unlike that pornstar...");
//
//        }
//        conclusion();
//        return (drump.getDisapprovalRate());
//
//    }

}