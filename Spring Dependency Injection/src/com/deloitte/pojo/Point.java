package com.deloitte.pojo;

public class Point {
	
	private int X;
	private int Y;
	
	public Point() {
		System.out.println("Point instatiated");
	}
	
	
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
	public void setX(int x) {
		this.X = x;
		System.out.println("SetX");
		
	}
	public void setY(int y) {
		this.Y = y;
		System.out.println("SetY");
	}
	
	@Override
	public String toString() {
		return X+","+Y;
	}
}
