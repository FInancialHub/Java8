package Closerlooktomethodandclass;

public class Argumentpassing {

	void f77(int i,int y)
	{
		i+=2;
		y+=2;
	}
	
	public static void main(String[] args) {
		int i=8;
		int y=9;
		
		Argumentpassing a=new Argumentpassing();
		a.f77(1,1) ;
		System.out.println("i="+i+"  y="+y);

	}

}
