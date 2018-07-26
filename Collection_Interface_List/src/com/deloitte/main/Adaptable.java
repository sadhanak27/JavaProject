package com.deloitte.main;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

class Adaptable {
      public Collection<String> getResult(){
    	  
    	  TreeSet<String> result = new TreeSet<String>();
    	  
    	  result.add("Almond");
    	  result.add("Walnut");
    	  result.add("Peanut");
    	  result.add("Pine Nut");
    	  
    	  return result;
      }
	
	
	public static void main(String[] args) {
		
        Adaptable ad = new Adaptable();
        Collection<String> result = ad.getResult();
        for(String element:result) {
			System.out.println(element);
		}
        
        Iterator<String> iterator = result.iterator();
        String str;
        while(iterator.hasNext()) {
        	str = iterator.next();
        	System.out.println(str);
        	

        }
        
       
	}

}
