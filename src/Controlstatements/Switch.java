package Controlstatements;


import java.io.DataInputStream;


public class Switch {

	public static void main (String args [])
	{
		
		int x=0;
		
		DataInputStream d = new DataInputStream(System.in);
		
		try
		{
			x=Integer.parseInt(d.readLine());
		}
		catch(Exception e)
		{
			System.out.println("no such month's");
		}
		
		switch (x)
		{
		case 1: System.out.println("it is "+x+" jan");break;
		case 2: System.out.println("it is "+x+" feb");break;
		case 3: System.out.println("it is "+x+" mar");break;
		case 4: System.out.println("it is "+x+" april");break;
		case 5: System.out.println("it is "+x+" may");break;
		case 6: System.out.println("it is "+x+" june");break;
		case 7: System.out.println("it is "+x+" july");break;
		case 8: System.out.println("it is "+x+" aug");break;
		case 9: System.out.println("it is "+x+" sep");break;
		case 10: System.out.println("it is "+x+" oct");break;
		case 11: System.out.println("it is "+x+" nov");break;
		case 12: System.out.println("it is "+x+"dec");break;
		
		}
	}
}
