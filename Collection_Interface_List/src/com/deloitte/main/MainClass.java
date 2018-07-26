package com.deloitte.main;

import java.util.LinkedList;


public class MainClass {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Water");
		list.add("Air");
		list.add("Fire");
		list.add("Earth");
		
		for(String element:list) {
			System.out.println(element);
		}

	}

}
