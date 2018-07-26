package com.deloitte.cui;

class Point{
	
	public int x;
	public int y;
}

public class MainClass {

	public static void main(String[] args) {
		
		
		Point[] points;
		points = new Point[3];
		
		points[0] = new Point();
		points[1] = new Point();
		points[2] = new Point();
		
		points[0].x = 1;
		points[0].y = 2;
		points[1].x = 3;
		points[1].y = 4;
		points[2].x = 5;
		points[2].y = 6;
		
      for(Point point:points) {
    	  System.out.println(point.x+" "+point.y);
      }
    	  
	}

}
