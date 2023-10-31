package com.power.interview_prepration;

import java.util.Scanner;

public class Third_Variable {
	int temp;
	int first;
	int second;

	public void swap() {
		temp = first;
		first = second;
		second = temp;
	}

	public void display() {
		System.out.println("first: " + first);
		System.out.println("second: " + second);
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in );
		
		Third_Variable t1 = new Third_Variable();
		System.out.println("first: ");
		t1.first=sc1.nextInt();
		System.out.println("second: ");
		t1.second=sc1.nextInt();
		t1.swap();
		t1.display();

	}

}
