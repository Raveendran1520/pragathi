package com.jsp.oops;

class Student1
{
	int sid;
	String sname;
	int sage;
	String sgender;
	String phno;
	static String collegename;
	static String collegeaddress;
	
	  public void addStudents(int id,String name,int age,String gender,String contact)
	  {
		  sid = id;
		  sname = name;
		  sage= age;
		  sgender = gender;
		  phno = contact;
	  }
	  public void display()
	  {
		   System.out.println(sid);
		   System.out.println(sname);
		   System.out.println(sage);
		   System.out.println(sgender);
		   System.out.println(phno);
		   System.out.println(collegename);
		   System.out.println(collegeaddress);
		   System.out.println("**************************");
	  }
	  public static void changeCollegeName(String name)
	  {
		  collegename = name;
	  }
	  public static void changeCollegeAddress(String address)
	  {
		  collegeaddress = address;
	  }
}
	  
public class StudentInfo2 
{

	public static void main(String[] args) 
	{
		//Student.collegename = "Jspiders";
		//Student.collegeaddress = "Marathahalli,Bangalore";
		
		Student1 s1 = new Student1();
		s1.addStudents(101,"Pinky",24,"Female","8448597565");
		s1.display();
		
		Student1 s2 = new Student1();
		s2.addStudents(102,"Vennela",23,"Female","7456215485");
		s2.display();
		
		Student1 s3 = new Student1();
		s3.addStudents(103,"Pallavi",25,"Female","6954687565");
		s3.display();
		
		 Student1.changeCollegeName("Jspiders");
		 Student1.changeCollegeAddress("Bangalore");
		 s1.display();
		 s2.display();
		 s3.display();
		
	}

}
