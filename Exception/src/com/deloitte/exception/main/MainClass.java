package com.deloitte.exception.main;

public class MainClass {

	public static void main(String[] args) {
	 
		try {
		System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
	}catch(ArrayIndexOutOfBoundsException ex) {
		System.out.println("Be sensible, enter 2 valid numbers");
	}catch(NumberFormatException ex) {
		System.out.println("Enter only numbers");
	}catch(ArithmeticException ex) {
		System.out.println("Cannot divide by 0");
	}

		
		System.out.println("The End");
	
}
}
