package com.jsp.superkeyword;

class Animal
{
	String color = "red";
}
class Dog extends Animal 
{
	String color = "Black";
	void printColor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class AnimalDriver
{
	public static void main(String[] args) 
	{
		 Dog dog = new Dog();
		 dog.printColor();
	}

}
