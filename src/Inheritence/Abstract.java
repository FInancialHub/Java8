package Inheritence;


abstract class Ab
{int i;
	abstract void f();
	void f6()
	{
		System.out.println("snjay");
	}

}


class cv extends Ab
{
	void f()
	{	}
	void f3()
	{
		}
}

public abstract class Abstract {

	
	public static void main(String[] args) {
		Ab a=new cv();
		a.f();
		a.f6();
		 cv u=new cv();
		 u.f6();
		 u.f3();
		u.f();

	}

}
