package com.jsp.constructer;

class Emp 
{
	int eid;
	String ename;
	int eage;
	
	public Emp(int id)
	{
		eid = id;
	}
	Emp(int id,String name)
	{
		this(id);
		ename = name;
	}
	Emp(int id,String name,int age)
	{
		this(id,name);
		eage = age;
	}
	public void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(eage);
	}
	
}
public class callToThis 
{
	public static void main(String[] args) 
	{
	     Emp emp1 = new Emp(101,"Akshay",28);
	     emp1.display();

	}

}
