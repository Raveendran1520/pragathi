package com.jsp.oops;

class B
{
	int i;
}
public class TestExample2 
{
	public static void main(String[] args) 
	{
         B a1 = new B();
         B a2 = a1;
         a2.i = 45;
         System.out.println(a1.i);
         System.out.println(a2.i);
         System.out.println("************");
         
         B a3 = a2;
         a2.i = 10;
         System.out.println(a1.i);
         System.out.println(a2.i);
         System.out.println(a3.i);
	}

}
