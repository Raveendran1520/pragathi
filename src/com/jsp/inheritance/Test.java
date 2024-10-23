package com.jsp.inheritance;

class A
{
	int i;
	int j;
}
class B extends A
{
	int k;
}
class Demo
{
	public static void main(String[] args)
	{
		A a = new A();
		System.out.println(a.i);
	}
}
public class Test
{
	public static void main(String[] args)
	{
		B b = new B();
		System.out.println(b.i);
		System.out.println(b.j);
		System.out.println(b.k);

	}

}
