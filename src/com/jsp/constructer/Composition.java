package com.jsp.constructer;

class A3
{
	public void m1()
	{
		System.out.println("m1() is defined");
	}
}
class B1
{
	A3 a;
	public B1(A3 a)
	{
		this.a = a;
	}
	public void m2()
	{
		a.m1();
		System.out.println("m2() is defined");
	}
}
public class Composition
{
	public static void main(String[] args)
	{
        //B1 b1 = new B1(new A3());
       // b1.m2();
		
		A3 a1 = new A3();
		B1 b1 = new B1(a1);
		b1.m2();

	}

}
