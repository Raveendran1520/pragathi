package com.jsp.constructer;

class AB
{
	public void m1()
	{
		System.out.println("m1() is defined");
	}
}
class ABC
{
	AB a;
	public void m2()
	{
		a = new AB();
		a.m1();
		System.out.println("m2() is defined");
	}
}
public class Aggrigation 
{
	public static void main(String[] args)
	{
		ABC ab = new ABC();
		ab.m2();
	}

}
