
abstract class E {
	int a;

	void f1(int a) {
		System.out.println("sanjay yo e" + a);
	}

	abstract void f3();

	E() {
		super();
		System.out.println("sanjay yoe" + a);
	}

	E(int a) {
		super();
		this.a = a;
	}

	final void f1(int i, int u) {

	}

	final void f1(int i, int u) {

	}

}

final class L extends E {
	int h;

	void f1(int i, int u) {

	}

	void f1(int a) {

		System.out.println("sanjay gaga" + this.h);
	}

	@Override
	void f3() {

		System.out.println("sanjay 788");
	}

	L() {
		super(5);

		this.a = a;
		;
	}

	L(int o) { // this();
		super(7);
		this.h = 7;

		System.out.println("sanjay 666" + (a + o + h));
		System.out.println("sanjay 666" + a + o + h);
	}

	L(int w, int u, int i) {
		super(9);
		this.h = 9;
		System.out.println("sanjay 666" + a + h + w + u + i);
		System.out.println("sanjay 666" + (a + h + w + i + u));
	}

}

class T {
	public static void main(String args[]) {
		// E e9=new E();
		L l9 = new L(5, 6, 9);
		L l8 = new L(2);

		E e6 = new L();
		// L e8=new E();
		l9.f1(8);
		e6.f1(9);
		e6.f3();

	}
}
