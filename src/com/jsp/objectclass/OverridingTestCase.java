package com.jsp.objectclass;

class Object
{
	//public class getClass()
	{
		
	}
}
class Class
{
	public String getName()
	{
		return " ";
	}
}
public class OverridingTestCase 
{
	public static void main(String[] args)
	{
		A obj = new A();
		//Class c1 = obj.getClass();
		//String s = c1.getName();
		//System.out.println(s);
		
		System.out.println(obj.getClass().getName());	
	}

}

