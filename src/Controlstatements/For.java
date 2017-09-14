package Controlstatements;

public class For {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j);
		}//System.out.print("456");
		System.out.println();
	}
		
		String s="sanjay";
		
		//for (int i=s.length();i>0;i--)
		for (int i=0;i<s.length();i++)
		{
			for(int j=i;j>(i-1);j--)
			{
				//System.out.print(s);
				System.out.println(""+s.substring(0, s.length()-i));
			}
			//System.out.println();
		}
		
String s89="sanjay";
		
		for(int i=0;i<s89.length();i++)
		{
			for(int y=0;y<=i;y++)
			{
				System.out.print(s89.charAt(y));
			}
			System.out.println();
		}
		
		String s8="12345";
		
		for(int i=s8.length();i>0;i--)
		{
			for(int y=i;y<i;y++)
			{
				System.out.println(s8.charAt(y));
			}
			
		}
		
String s98="sanjaydevalia";
		
		for(int i=0;i<s98.length();i++)
		{
			for(int y=0;y<s98.length()-i;y++)
			{
				System.out.print(s98.charAt(y));
			}
			System.out.println();
		}
	}

}
