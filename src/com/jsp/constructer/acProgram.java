package com.jsp.constructer;

class AC
{
	int temperature;
	public AC(int temp)
	{
		
		temperature = temp;
	}
	public AC()
	{
		temperature = 22;
	}
}
public class acProgram 
{
	
	public static void main(String[] args)
	{
        AC ac1 = new AC(52);
        AC ac2 = new AC(63);
        AC ac3 = new AC(79);
        
        System.out.println(ac1.temperature);
        System.out.println(ac2.temperature);
        System.out.println(ac3.temperature);
	}

}
