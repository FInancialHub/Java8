package san;
class A1
{
	A1(){
		super();
		System.out.println("here A1");
		this.f1();
this.a=a;
	}
	int a;
	private void f1()
	{
		System.out.println("sanjay");
	}
	public void f2()
	{
		f1();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}

class B extends A1
{
	B(){
		super();
		System.out.println("here B");
	}
	
	B(int a){
		
	    //super();
	    f1();
		System.out.println("here B");
		
	}
int b;
void f1()
{
System.out.println("saan");	
}
}

public class Poo
{
 
	public static void main (String args[])
	{
		
		B	 a1 = new B();//cHILD cLASS objet
		A1 b1 =new A1();// PARENT CLASS OBJECT
		//this.f2();
		//a1.f1();	
		//B b2 = new A1();
		//A1 a2 = new B();
	  b1.f2();
		//a1.try {
		//	b1.finalize();
	//	} catch (Throwable e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		
		
	}
}
