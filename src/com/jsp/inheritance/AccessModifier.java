package com.jsp.inheritance;

class AB
{
	private int i = 45;
	public void accessI()
	{
		System.out.println(i);
	}
}
class BA extends AB
{
	public void m2()
	{
		accessI();
	}
}
public class AccessModifier 
{
	public static void main(String[] args)
	{
          BA b = new BA();
          b.m2();
          
          AB a = new AB();
         // System.out.println(a.i);
          a.accessI();
         
	}

}
