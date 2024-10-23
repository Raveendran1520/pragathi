package com.jsp.constructer;
class A1
{
	int i;
	public A1()
	{
		i = 100;
	}
}
public class noArgConstructor 
{
	public static void main(String[] args)
	{
	      A1 a1 = new A1();
	      A1 a2 = new A1();
	      A1 a3 = new A1();
	      
	      System.out.println(a1.i);
	      System.out.println(a2.i);
	      System.out.println(a3.i);
	}

}
