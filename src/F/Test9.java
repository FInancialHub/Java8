
package F;


class Y 
{
	Y()
	{
	System.out.println("sanj");
}
	Y(int i)
	{
		//this();
		System.out.println("sanja");
	}
	Y(int u, int y)
	{//this(u);
		System.out.println("sanjayi"+u+y);
	}
	public void f1(int qi,int yy)
	{
		qi=56;
		yy=89;
		
	}
}

class B extends Y
{int a;
	B()
	{
		super();
	System.out.println("sanja");
}
	B(int w)
	{
		super(w);
		System.out.println("sanja");
	}
	B(int t, int e)
	{super(t,e);
		System.out.println("sanja"+t+e);
	}
	
	void f1(int o, int y, int p)
	{
		this.a=o;
		
		
	}
	
}

class C extends B
{
	C()
	{
	System.out.println("sanjay");
}
}

public class Test9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	B c1=new B(6,9);
	
	}

}
