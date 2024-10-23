package com.jsp.constructer;

class A
{
	public void m1()
	{
		System.out.println("m1() is defined");
	}
}
class B
{
	public void m2()
	{
		A a1 = new A();
		a1.m1();
		System.out.println("m2() is defined");
	}
}
public class Association 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.m2();
	}

}
