package com.jsp.objectclass;

class AB extends Object
{
	
}
class BA extends AB
{
	
}

public class InstanceOf 
{
	public static void main(String[] args)
	{
          Object obj = new Object();
          System.out.println(obj instanceof Object);
          System.out.println(obj instanceof AB);
          System.out.println(obj instanceof BA);
          System.out.println("__________________________");
          
          AB a = new AB();
          System.out.println(a instanceof Object);
          System.out.println(a instanceof AB);
          System.out.println(a instanceof BA);
          System.out.println("___________________________");
          
          BA b = new BA();
          System.out.println(b instanceof Object);
          System.out.println(b instanceof AB);
          System.out.println(b instanceof BA);
          System.out.println("_____________________________");
	}

}
