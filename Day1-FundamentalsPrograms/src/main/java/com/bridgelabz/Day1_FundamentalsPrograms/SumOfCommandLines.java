package com.bridgelabz.Day1_FundamentalsPrograms;

import java.util.Scanner;

public class SumOfCommandLines {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        System.out.println("Enter any Number: ");
	        int s = input.nextInt();
	        int r = input.nextInt();
	        int sum = s + r;
	        System.out.println("Sum is " + sum);
	        input.close();
	}

}
