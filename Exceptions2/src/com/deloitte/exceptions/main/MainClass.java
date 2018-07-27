package com.deloitte.exceptions.main;

class IllegalAgeException extends Exception{   //checked exception
	@Override
	public String getMessage() {
		
		return "Minimum age is 18";
	}
}

class Voter{
	public void register(int age) throws IllegalAgeException {
		if(age<18) {
			throw new IllegalAgeException();
		}
	}
}



public class MainClass {

	public static void main(String[] args) {
		Voter voter = new Voter();
		
		try {
			voter.register(16);
		} catch (IllegalAgeException e) {
				e.printStackTrace();
		}
	}

}
