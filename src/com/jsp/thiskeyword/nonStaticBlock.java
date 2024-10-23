package com.jsp.thiskeyword;

public class nonStaticBlock 
{
		static int age = 99;
		{
			age = 101;
			System.out.println("non static frm A");
			System.out.println(age);
		}
		public static void main(String[] args)
		{
		System.out.println("good morning");
        nonStaticBlock a1 = new nonStaticBlock();
	}

}
