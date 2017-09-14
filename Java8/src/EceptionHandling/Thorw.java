package EceptionHandling;

public class Thorw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try
		{
			
			try
			{
				throw new ArithmeticException();
				
			}
			catch (ArithmeticException e) {
				System.out.println("inner ="+e);
				throw e;
			}
			
		}
		catch (Exception e) {
			System.out.println("outter ="+e);
			
		}
		
	}

}
