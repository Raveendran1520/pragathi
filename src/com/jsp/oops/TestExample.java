package com.jsp.oops;

class A
{
	int i;
	public void display()
	{
		System.out.println(i);
	}
}
public class TestExample 
{
	public static void main(String[] args) 
	{
          A a1;
          a1 = new A();
          a1.i = 45;
          System.out.println(a1.i);
          a1.display();
          System.out.println("************");
          
          a1 = new A();
          a1.i = 0;
          System.out.println(a1.i);
          a1.display();
          
	}

}
