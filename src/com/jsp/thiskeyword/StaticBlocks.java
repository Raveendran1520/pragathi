package com.jsp.thiskeyword;

public class StaticBlocks
{
	static int i;
	static 
	{
		i = 10;
		System.out.println(i);
	}
	public static void main(String[] args)
	{
		System.out.println("Good Morning");
	}
	static 
	{
		System.out.println("static from A");
	}
}
