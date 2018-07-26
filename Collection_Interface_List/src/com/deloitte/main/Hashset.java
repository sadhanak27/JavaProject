package com.deloitte.main;

import java.util.HashSet;


public class Hashset {

	public static void main(String[] args) {
		
		HashSet<String> list = new HashSet<String>();
		
		list.add("Water");
		list.add("Air");
		list.add("Fire");
		list.add("Earth");
		list.add("Earth");
		
		for(String element:list) {
			System.out.println(element);
		}

	}

}
