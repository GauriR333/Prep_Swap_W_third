package com.power.interview_prepration;

import java.util.Scanner;

public class SwippingThirdVar {
	int first;
	int second;
	int temp;

	void display() {
		System.out.println("first: "+first);
		System.out.println("second: "+second);
	}

	void calculation() {
		temp = first;
		first = second;
		second = temp;
	}

	void userValue() {

	}

	public static void main(String[] args) {
		SwippingThirdVar s1 = new SwippingThirdVar();
		Scanner sc = new Scanner(System.in);
		System.out.println("first value: ");
		s1.first = sc.nextInt();
		System.out.println("second value: ");
		s1.second = sc.nextInt();

		s1.calculation();
		s1.display();
	}

}
