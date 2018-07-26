package com.deloitte.main;

import java.util.LinkedList;

class Activity1 {

	 
	
	public static void main(String[] args) {
		
		LinkedList<String> result = new LinkedList<String>();
	  	  
	  	  result.add("B");
	  	  result.add("C");
	  	  result.add("D");
	  	  result.add("X");
	  	  result.add("Y");
	  	  result.addLast("Z");
	  	  result.addFirst("A");
	  	  
	  	  result.add(1, "A2");
	  	  
	  	  System.out.println("Original contents of result: " + result);
	  	  
	  	  //remove
	  	  
	  	  result.remove("F");
	  	  result.remove(2);
	  	  
	  	  System.out.println("Contents after deletion ");
	}

}
