package com.jsp.thiskeyword;

class A
{
	static
	{
		System.out.println("static from A");
	}
	static
	{
		System.out.println("static from A class member");
	}
}
class B
{
	//System.out.println("non-static frm B");
}

public class Test
{
	static 
	{
		System.out.println("Good morning");
	}
	public static void main(String[] args)
	{
        A a1 = new A();
	}

}
