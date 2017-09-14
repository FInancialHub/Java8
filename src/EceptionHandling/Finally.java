package EceptionHandling;

public class Finally {


static void f1()
{try 
	{
	throw new ArithmeticException();
	}
finally
	{
	System.out.println("f1()");
	}
	
}
static int f2()
{
	try 
	{
		System.out.println("inside f2()");
		return 1;
	}
finally
	{
	System.out.println("f2()");
	}
	
}
static void f3()
{
	try 
	{
		System.out.println("inside f3()");
	}
finally
	{
	System.out.println("f3()");
	}
}

	public static void main(String[] args) {
		try 
		{
			throw new ArithmeticException();
			
			
		}
		//finally
		//{
		//	System.out.println("this is executed");
	//	}
		
		catch (ArithmeticException e) {
			System.out.println("e=  "+e);
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception ="+e);
		}
		finally
		{
			System.out.println("this is executed");
		}
		try{
			f1();
			}
		catch (ArithmeticException e) {
			System.out.println("f1()"+e);
		}
		f2();
		f3();
		
}

}
