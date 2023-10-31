package com.power.interview_prepration;

import java.util.Scanner;

public class No_third_varbale {
	int first;
	int second;

	public void calculation() {
		first = first + second;
		second = first - second;
		first = first - second;
	}

	public void display() {
		System.out.println("first: " + first);
		System.out.println("second: " + second);
	}
	
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
	
		No_third_varbale n1 = new No_third_varbale();
		System.out.println("First value: ");
		n1.first=sc1.nextInt();
		System.out.println("Second value: ");
		n1.second=sc1.nextInt();
		n1.calculation();
		n1.display();
	}
}
