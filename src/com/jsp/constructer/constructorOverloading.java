package com.jsp.constructer;

class Rectangle1
{
	int length,breadth;
	
	public Rectangle1()
	{
		length=10;
		breadth=20;
	}
	public Rectangle1(int num)
	{
		length = num;
		breadth = num;
	}
	public Rectangle1(int len,int bread )
	{
		length = len;
		breadth = bread;
	}
	public void area()
	{
		System.out.println("Area of Rectangle is: "+(length*breadth));
	}
}
public class constructorOverloading
{
	public static void main(String[] args) 
	{
		Rectangle1 r1 = new Rectangle1();
		Rectangle1 r2 = new Rectangle1(12);
		Rectangle1 r3 = new Rectangle1(9,3);
		
		r1.area();
		r2.area();
		r3.area();
	}

}
