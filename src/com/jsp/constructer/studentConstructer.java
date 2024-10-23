package com.jsp.constructer;

class Student
{
	int sid;
	String sname;
	int sage;
	public Student(int id,String name,int age)
	{
		sid = id;
		sname = name;
		sage = age;
	}
	public void displayStudentDetails()
	{
		System.out.println("Student id: "+sid);
		System.out.println("Student name: "+sname);
		System.out.println("Student age: "+sage);
		System.out.println("******************************");
	}
}
public class studentConstructer
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(101,"kiran",25);
		Student s2 = new Student(102,"Arun",27);
		Student s3 = new Student(103,"Usman",26);
		
		s1.displayStudentDetails();
		s2.displayStudentDetails();
		s3.displayStudentDetails();
	}

}
