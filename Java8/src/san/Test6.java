package san;

public abstract class Test6 
{
	Test6()
	{
		this.f1();	
	}
    public void f1()
    {
    	System.out.println("jj");
    };
    
    public static void main (String args[])
    {
    	
    	A a1=new A();
    	a1.f1();
    }
}

class A extends Test6
{
int a;
void f2()
{
	this.a=a;
System.out.println("ll");
}
}


