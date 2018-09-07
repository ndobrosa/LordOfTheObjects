package com.skilldistillery.drumpGame;

public class President extends Person {

	private int approvalRate = 0;
	private int disapprovalRate = 0;

	// constructors
	public President() {
		super("Ronald Drump", 72);
	}

	public President(String name, int age) {
		super(name, age);
	}

	// setters and getters
	public int getApprovalRate() {
		return approvalRate;
	}

	public void setApprovalRate(int approvalRate) {
		this.approvalRate = approvalRate;
	}

	public int getDisapprovalRate() {
		return disapprovalRate;
	}

	public void setDisapprovalRate(int disapprovalRate) {
		this.disapprovalRate = disapprovalRate;
	}

	// other methods
	public void increaseApprovalRate(int num) {
		approvalRate += num;
	}

	public void increaseDisapprovalRate(int num) {
		disapprovalRate += num;
	}

	@Override
	public String getInfo() {
		String info = "My name is " + getName() + " and I am the president of the USA!\n";
		info += "I'm " + getAge() + " years young.";
		return info;
	}
}