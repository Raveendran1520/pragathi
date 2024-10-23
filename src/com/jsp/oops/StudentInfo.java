package com.jsp.oops;

public class StudentInfo 
{
	public static void main(String[] args) 
	{
		Student.collegename = "Jspiders";
		Student.collegeaddress = "Bangalore";
		
		Student s1 = new Student();
		s1.sid = 101;
		s1.sname = "priya";
		s1.age = 22;
		s1.sgender = "Female";
		s1. phno = "6587412358";
		
		Student s2 = new Student();
		s2.sid = 102;
		s2.sname = "poojitha";
		s2.age = 23;
		s2.sgender = "Female";
		s2. phno = "8954685955";
		
		Student s3 = new Student();
		s3.sid = 103;
		s3.sname = "mounika";
		s3.age = 22;
		s3.sgender = "Female";
		s3. phno = "7548987458";
        
          s1.display();
          System.out.println("************************************");
          
          s2.display();
          System.out.println("************************************");
          
          s3.display();
          System.out.println("************************************");

	}
}
	class Student
	{
		int sid;
		String sname;
		int age;
		String sgender;
		String phno;
		static String collegename;
		static String collegeaddress;
		
	public void display()
	{
		System.out.println("Student id : "+sid);
		System.out.println("Student name : "+sname);
		System.out.println("Student age : "+age);
		System.out.println("Student Gender : "+sgender);
		System.out.println("Student contact : "+phno);
		System.out.println("College Details : "+collegename);
		System.out.println("Address Details : "+collegeaddress);
	}
	
	public static void collegeName()
	{
		collegename = "JSP";
	}
	public static void collegeAddress()
	{
		collegeaddress = "Bangalore";
	}

}

