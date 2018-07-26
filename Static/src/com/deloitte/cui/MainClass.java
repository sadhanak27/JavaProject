package com.deloitte.cui;

class Point{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y= y;
	}
	
	@Override
	public boolean equals(Object target) {
		
		if(target!= null) {
			if (target instanceof Point) {
				Point point = (Point) target;
				if(x == point.x && y == point.y)
					return true;
			}		
		}
		return false;	}
	
}


public class MainClass {

	public static void main(String[] args) {
	
		Point p1 = new Point(10, 12);
		Point p2 = new Point(5,6);
		
		System.out.println(p1.equals(p2));
		
	}

}
