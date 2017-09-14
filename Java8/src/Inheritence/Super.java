package Inheritence;

class C {
	int i=10;
	C(){
		System.out.println("super constructor");
	}
	void fff() {
		
		System.out.println("super fff");
		//System.out.println("C=" +i);
	}

	void show()
	{
		System.out.println("super show");
	}
}

class D extends C {
	int i = 20;

	D(/*int i*/) {

		//System.out.println("D=" + i);
	}

	void fff() {
		super.show();
		super.fff();
		System.out.println("C=" +super.i);
		System.out.println("D=" + i);
	}

	/*void  show()
	{
		super.show();
		
	}*/
	
}

public class Super {

	public static void main(String[] args) {

		C c = new C();
		D d = new D();
		C f = new D();

		d.fff();
	
	}

}

