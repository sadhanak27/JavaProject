package com.deloitte.main;

class Point<T>{
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public T getY() {
		return y;
	}
	public void setX(T x) {
		this.x = x;
	}
	public void setY(T y) {
		this.y = y;
	}
	
	
}

public class MainClass {

	public static void main(String[] args) {
		Point<Float>point1 = new Point<Float>();
		point1.setX(4.5f);
		point1.setY(55.2f);
		System.out.println(point1.getX() + " " + point1.getY());
		Point<Integer>point2 = new Point<Integer>();
		point2.setX(7);
		point2.setY(9);
		System.out.println(point2.getX() + " " +point2.getY());
		Point point3 = new Point();
		point3.setX(4.5);
		Double x = (Double)point3.getX();
		
		System.out.println(x);
				
				

	}

}
