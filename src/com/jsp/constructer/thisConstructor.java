package com.jsp.constructer;

class Rectangle2
{
	int length, breadth;
	public Rectangle2()
	{
		length = 5;
		breadth = 3;
	}
	public Rectangle2(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle2(int n)
	{
		this(n,n);
		
	}
	public void area()
	{
		System.out.println("Area of Rectangle is: "+(length*breadth));
	}
}

public class thisConstructor 
{
	public static void main(String[] args) 
	
	{
		Rectangle2 r1 = new Rectangle2();
		r1.area();
		
		Rectangle2 r2 = new Rectangle2(5);
		r2.area();
		
		Rectangle2 r3 = new Rectangle2(7,4);
		r3.area();

	}

}
