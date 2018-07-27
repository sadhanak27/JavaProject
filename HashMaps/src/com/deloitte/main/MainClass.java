package com.deloitte.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		HashMap<Integer, String> result = new HashMap<Integer, String>();
		
		result.put(123,"ABC");
		result.put(456,"DEF");
		result.put(789,"GHI");
		result.put(101,"JKL");
		
		System.out.println(result.get(789));
		System.out.println(result.size());
		
		Set<Integer> keys = result.keySet();
		
		for(Integer key:keys) {
			System.out.println(key+"-"+result.get(key));
		}
		
		Iterator<Integer> iterator = keys.iterator();
		Integer key;
		while(iterator.hasNext()) {
			key = iterator.next();
			System.out.println(key+"-"+result.get(key));
		}

	}

}

