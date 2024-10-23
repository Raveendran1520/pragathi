package com.jsp.constructer;

import java.util.Scanner;

class Airtel
{
	String simName;
	
	public Airtel(String simName)
	{
		this.simName = simName;
	}
	public void callImplimentation()
	{
		System.out.println("you cannot use internet while calling using "+simName);
	}
}
class Jio
{
	String simName;
	
	public Jio(String simName)
	{
		this.simName = simName;
	}
	public void callImplimentation()
	{
		System.out.println("you cannot use internet while calling using "+simName);
	}
}
class Battery
{
	String batteryName;
	
	public Battery(String batteryName)
	{
		this.batteryName = batteryName;
	}
}
class Phone
{
	String phoneName;
	Airtel airtel;
	Jio jio;
	Battery battery;
	
	public Phone(String phoneName,Battery battery)
	{
		this.phoneName = phoneName;
		this.battery = battery;
	}
	public void call()
	{
		Scanner scn = new Scanner(System.in);
        System.out.println("Enter Airtel or Jio: ");
        int input = scn.nextInt();
        
        if(input==1)
        {
        	airtel = new Airtel("Airtel");
        	airtel.callImplimentation();
        }
        else if(input==2)
        {
        	jio = new Jio("Jio");
        	jio.callImplimentation();
        }
	}  		
}
public class phoneDevelopment 
{
	public static void main(String[] args)
	{
           Battery battery = new Battery("Lithium-ion");
           Phone phone = new Phone("SAMSUNG",battery);
           phone.call();
	}
}

