package com.jsp.oops;

class ICICI
{
	int balance = 20000;
	public void checkBalance()
	{
		 System.out.println("Your Current balance is: "+balance);
	}
	public void withdraw(int amount)
	{
		if(amount>balance)
		{
			 System.out.println("Insufficient balance");
		}
		else
		{
			balance= balance-amount;
			 System.out.println(amount+ " Sent Successfully");
			 System.out.println("Thank you");
		}
	}
}
public class BankTransaction
{
	public static void main(String[] args) 
	{
	     ICICI cus1 = new ICICI();
	     ICICI phonepay = cus1;
	     ICICI gpay = cus1;
	     ICICI paytm = cus1;
	     
	     phonepay.checkBalance();
	     gpay.checkBalance();
	     paytm.checkBalance();
	     
	     gpay.withdraw(17500);
	     
	     phonepay.checkBalance();
	     gpay.checkBalance();
	     paytm.checkBalance();

	}

}
