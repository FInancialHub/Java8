import java.io.DataInputStream;
import java.util.*;

public class Account {
	int j;
	String r;
	
	public void getno()
	{
	}
	
	
	public int setno(int j)
	{
		return j;
	}
	
	public void getname()
	{
		
	}
	
	public String setname(String r)
	{
		return r;
	}

	void deposit()
	{
	
		
	}
	public static void main(String[] args) {
	

		int i=0;
		String s = "";

		DataInputStream d = new DataInputStream(System.in);
		
		System.out.print("enter name=");
		try
		{
			s=d.readLine();
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("name is= "+s);
		
		System.out.print("enter no =");
		try {
			i=Integer.parseInt(d.readLine());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("no is ="+i);
		
	}
	
	
	
	

}
