
public class Test23 
{


	public static void main (String args[])
	{
		//Qe a1=new Qe();
		//Qe a2=new Qe(a1);
		Qe a9 =new Qw();
		a9.f9();
	}
	
}


abstract class Qe
{
	int a;
	int b;
	Qe(Qe t)
	{
		t.a=a;
	
		t.b=b;
		
	}
	Qe()
	{
		System.out.println("sanjjjj");
	}
	void f9()
	{
		System.out.println("sandfhgdfgv");
	}
}

class Qw extends Qe
{
	
	Qw(Qe t)
	{
		t.a=a;
	
		t.b=b;
		
	}
	Qw()
	{
		System.out.println("san"+(a+b));
	}
}
