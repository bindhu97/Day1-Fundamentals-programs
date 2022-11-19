package com.bridgelabz.Day1_FundamentalsPrograms;

import java.util.Scanner;

public class NameCommandLine {

	public static void main(String[] args) {
		System.out.println("Enter name");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println("Entered name is " + s);
		sc.close();
	}

}