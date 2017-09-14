package EceptionHandling;

public class Throws {

	static void f()throws ArithmeticException
	{
		//throw new ArithmeticException();
		int i=0;
		int y=45/i;
		System.out.println("inner ="+y);
	}
	public static void main(String[] args) {
		
		try
		{
			
			Throws.f();
		}
catch (ArithmeticException e) {
	System.out.println("e="+e);
}
	}

}
