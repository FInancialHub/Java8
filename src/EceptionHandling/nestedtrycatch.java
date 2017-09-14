package EceptionHandling;

public class nestedtrycatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try
		{
		int i=0;
		int y=45/i;
			
		
		try
		{
			int  c[]={55};
			c[78]=89;
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}}
		catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
