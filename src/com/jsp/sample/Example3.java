package com.jsp.sample;

public class Example3
{
      public static void m1(int i) 
      {
    	   System.out.println("I Love Java");
    	   if(i==1000) return ;
    	   m1(i+1);
      }
	public static void main(String[] args) 
	{
		m1(1);

	}

}
