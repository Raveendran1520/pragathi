package com.jsp.superkeyword;

class Animals
{
	void eat()
	{
		System.out.println("Eating........");
	}
}
class Tiger extends Animals
{
	void eat()
	{
		System.out.println("Eating Rabbits");
	}
	void Roar()
	{
		System.out.println("Tiger roars......");
	}
	void printAnimal()
	{
		super.eat();
		Roar();
	}
}
public class TestSuper 
{
	public static void main(String[] args)
	{
		Tiger tiger = new Tiger();
		tiger.printAnimal();
	}

}
