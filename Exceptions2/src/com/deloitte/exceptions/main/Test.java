package com.deloitte.exceptions.main;

class Test {
         
    public void test1() {
    	System.out.println("Test1");
    	test2();
    }
    public void test2() {
    	System.out.println("Test2");
    	test3();
    }
    public void test3() {
    	System.out.println("Test3");
    	test4();
    }
    public void test4() {
    	System.out.println("Test4");
    	
    	try {
			Class.forName("java.util.Date");
		} catch (ClassNotFoundException e) {
				e.printStackTrace();
		}
    }
	
	
	public static void main(String[] args) {
		Test t1 = new Test();
		
		t1.test1();
		System.out.println("End");

	}

}
