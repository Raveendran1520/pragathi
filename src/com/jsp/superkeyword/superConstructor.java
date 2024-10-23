package com.jsp.superkeyword;

class Fruit
{
	Fruit()
	{
		System.out.println("fruits are good for health");
	}
}
class Apple extends Fruit
{
	Apple()
	{
		super();
		System.out.println("Apple tastes sweet");
	}
}
public class superConstructor 
{
	public static void main(String[] args) 
	{
		Apple apple = new Apple();
	}

}
