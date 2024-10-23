package com.jsp.constructer;

class A2
{
	int i;
	public A2(int i)
	{
		this.i = i;
	}
}
public class argConstructor
{
	public static void main(String[] args) 
	{
		 A2 a1 = new A2(10);
		 A2 a2 = new A2(35);
		 A2 a3 = new A2(84);
		 
		 System.out.println(a1.i);
		 System.out.println(a2.i);
		 System.out.println(a3.i);

	}

}
