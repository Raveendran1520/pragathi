package com.jsp.objectclass;

class Bank
{
	int rateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	@Override
	int rateOfInterest()
	{
		return 2;
	}
}

class ICICI extends Bank
{
	@Override
	int rateOfInterest()
	{
		return 5;
	}
}

class HDFC extends Bank
{
	@Override
	int rateOfInterest()
	{
		return 7;
	}
}

class AXIS extends Bank
{
	int rateOfInterest()
	{
		return 10;
	}
}
public class BankDriver
{
	public static void main(String[] args)
	{
		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		HDFC hdfc = new HDFC();
		AXIS axis = new AXIS();
		
		System.out.println(sbi.rateOfInterest());
		System.out.println(icici.rateOfInterest());
        System.out.println(hdfc.rateOfInterest());
        System.out.println(axis.rateOfInterest());
	}

}
