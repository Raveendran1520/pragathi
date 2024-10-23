package com.jsp.objectclass;

class A
{
	int i;
	@Override
	public String toString()
	{
		return "i = "+i;
	}
}
class B
{
	
	
}
public class ObjectClass 
{
	public static void main(String[] args) 
	{
		A a = new A();
		System.out.println(a.toString());
		System.out.println(a.getClass());

		B b = new B();
		System.out.println(b.getClass());
	}

}
