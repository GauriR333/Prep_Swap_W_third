package com.power.interview_prepration;

public class without_third_variable {
int first;
int second;
	void display() {
		System.out.println(first);
		System.out.println(second);
	}
	void calculation() {
		first=first-second;
		second=first+second;
		first =second-first;
	}
	public static void main(String[] args) {
		
		without_third_variable w1 = new without_third_variable();
		w1.first=10;
		w1.second=20;
		w1.calculation();
		w1.display();
		
	
	}

}
