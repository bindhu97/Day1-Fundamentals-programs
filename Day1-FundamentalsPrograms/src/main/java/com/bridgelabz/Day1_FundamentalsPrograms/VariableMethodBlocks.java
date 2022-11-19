package com.bridgelabz.Day1_FundamentalsPrograms;

public class VariableMethodBlocks {

	static int a = 20;     // VARIABLE

    static void display()   // METHOD
    {
        System.out.println("This is my static method");
    }

    static {
        System.out.println("This is my static block");   // BLOCK
    }


	public static void main(String[] args) {
		System.out.println("This is my static variable " + VariableMethodBlocks.a);
		VariableMethodBlocks.display();

	
	}
}