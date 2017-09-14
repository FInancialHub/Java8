package EceptionHandling;

import java.io.DataInputStream;

public class Multiplecacth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int p = 1, y,i;
		DataInputStream d=new DataInputStream(System.in);

		for(int o=0;o<10;o++){
		try 
		{
			System.out.print("y=");
			y=Integer.parseInt(d.readLine());
			System.out.print("i=");
			i=Integer.parseInt(d.readLine());
			p=y/i;
			
			int c[]={1};
			c[5]=45;
		}
		
catch (Exception e) 
		{
	System.out.println("excep"+e);
		}



		}
}
	
}
