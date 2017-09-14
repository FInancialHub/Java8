package Closerlooktomethodandclass;

public class Overloadingmethod {

	void f8()
	{
		System.out.println("456");
	}
	
	 void f8(int i,int y)
	{
		 System.out.println(i*y);
	}
	 void f8(int i)
		{
			 System.out.println(i);
		}
	 void f8(double p)
		{
			 System.out.println(p);
		}
	public static void main(String[] args) {
		int e=56;
		Overloadingmethod o=new Overloadingmethod();
		o.f8();
		o.f8(8, 9);
		o.f8(8);
		o.f8(88.23);
		o.f8(e);

	}

}
