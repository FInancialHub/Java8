package EceptionHandling;

public class Arith {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try
		{int i=0;
		int e=45/i;
		System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("sss");
	}

}
