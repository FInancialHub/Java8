import java.io.DataInputStream;


public class Test2 
{
	public static void main(String[] args) 
	{
		
			String a="2";
			String b="3"; 
		
		DataInputStream d =new DataInputStream(System.in);
		
		try
		{
			System.out.println(" Enter your name ");
			 a = d.readLine();
			System.out.println(" Enter your surname ");
			 b = d.readLine();
		}
		catch(Exception e)
		{	
		}
		System.out.println(" your name "+a +b);
		
	}
	
}
