package Closerlooktomethodandclass;

public class Argumentpassing1 {
	int a;
	int b;

	void f7(Argumentpassing1 t) {
		 t.a+= 2;
	     t.b+= 2;
	}

	Argumentpassing1(int i,int y) {
		a=i;
		b=y;
	}

	public static void main(String[] args) {

		Argumentpassing1 a1 = new Argumentpassing1(2,2);
		System.out.println("a="+a1.a+"  b="+a1.b);
		
		a1.f7(a1);
		System.out.println("a="+a1.a+"  b="+a1.b);
		

	}
}