package com.jsp.constructer;

class Students
{
	int sid;
	String sname;
	int sage;

	public Students(int sid, String sname,int sage)
    {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
    }
    Students(int sid,String sname,Students s)
    {
	    this.sid = sid;
	    this.sname = sname;
	    this.sage = s.sage;
    }
    public void details()
    {
    	System.out.println("Student ID : "+sid);
    	System.out.println("Student Name : "+sname);
    	System.out.println("Student age : "+sage);
    	System.out.println("***********************");
    }
}
public class copyConstructor 
{
	public static void main(String[] args) 
	{
		Students s1 = new Students(11,"Manohar",21);
		s1.details();
		
		Students s2 = new Students(12,"Deeya",15);
		s2.details();
		
		Students s3 = new Students(13,"Uma",s1);
		s3.details();
	}
}
