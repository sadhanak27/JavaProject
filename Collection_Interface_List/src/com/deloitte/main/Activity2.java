package com.deloitte.main;

import java.util.ArrayDeque;

public class Activity2 {

	public static void main(String[] args) {
		
		ArrayDeque<String> adq = new ArrayDeque <String>();
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		System.out.println("Popping the stack: ");
		
		while(adq.peek() != null) {
			System.out.println(adq.pop() + " ");
		}
			
		System.out.println();
		
	}

}
