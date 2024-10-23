package com.jsp.objectclass;

class Airtel
{
	public void m1()
	{
		System.out.println("Airtel is available to take the calls");
	}
}
class Jio extends Airtel
{
	@Override
	public void m1()
	{
		System.out.println("Jio is available to take the calls");
	}
}
public class Test
{
	public static void main(String[] args)
	{
		Jio jio = new Jio();
		jio.m1();

	}

}
