package com.jsp.superkeyword;

class Flower
{
	String color = "pink";
	void smell()
	{
		System.out.println("Flower smells very good");
	}
}
class Rose extends Flower
{
	String color = "Yellow";
	void printColor()
	{
		System.out.println(color);
		super.smell();
		System.out.println(super.color);
		
	}
}
public class AnimalDriver2
{
	public static void main(String[] args) 
	{
		Rose rose = new Rose();
		rose.printColor();
	}

}
