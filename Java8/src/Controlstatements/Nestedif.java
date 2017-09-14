package Controlstatements;

import java.io.DataInputStream;


public class Nestedif {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
	int x=1;
	
	DataInputStream d=new DataInputStream(System.in);
	
	try 
	{
		if (x==0){
			throw new ArithmeticException ();
		}
		else{
		x=Integer.parseInt(d.readLine());
		}
	}
	catch (Exception e) {
		System.out.println("no such number");
	}
	
	
	
	if (x==1)
	{
		System.out.println("it is  "+x);
	}
	else if (x==2)
	{
		System.out.println("it is "+x);
		
	}
	else if (x==3)
	{
		System.out.println("it is  "+x);
	}
	else if (x==4)
	{
		System.out.println("it is "+x);
		
	}
	else if (x==5)
	{
		System.out.println("it is  "+x);
	}
	else if (x==6)
	{
		System.out.println("it is  "+x);
		
	}
	else if (x==7)
	{
		System.out.println("it is "+x);
	}
	else if (x==8)
	{
		System.out.println("it is "+x);
		
	}
	else if (x==9)
	{
		System.out.println("it is "+x);
	}
	else if (x==10)
	{
		System.out.println("it is  "+x);
		
	}
	}

	}


