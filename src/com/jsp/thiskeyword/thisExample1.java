package com.jsp.thiskeyword;

class Rectangle
{
	int length;
	int breadth;
public void addValues(int length, int breadth)
{
	this.length = length;
	this.breadth = breadth;
}
public void area()
{
	 System.out.println("Area of a rectangle: "+length*breadth);
}
public class thisExample1 
{

	public static void main(String[] args)
	{
         Rectangle r1 = new Rectangle();
         r1.addValues(7, 6);
         r1.area();
         
         Rectangle r2 = new Rectangle();
         r2.addValues(5, 9);
         r2.area();

	}
  }
}
