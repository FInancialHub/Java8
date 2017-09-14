package Inheritence;

import java.io.IOException;

class A {
	static int i = 1;
	static int j = 1;
	static int y = 5;

	void show() throws Exception{
		System.out.println("A=" + (i + j));
	}
	void show(Object a) throws  NullPointerException{
		System.out.println("show(String a)A=" + (i + j));
	}

	static void fg() {
		System.out.println("fg=" + (i + j));

	}
}

class B extends A {
	int k = 1;

	void show(Object a) throws RuntimeException{
		System.out.println("show(String a)A=" + (i + j));
	}
	
	void show() throws IOException,RuntimeException,Exception {
		System.out.println("B=" + (i + j + k));
	}

	static void fg() {
		System.out.println("B=" + (i + j));

	}
	void show(String a) {
		System.out.println("show(String a)B=" + (i + j));
	}
}

class Inhertenc {

	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		A c = new B();

		a.i = 5;
		a.j = 5;

		b.i = 1;
		b.j = 2;
		b.k = 3;

		c.show("sanjay");

		a.fg();
		c.fg();
		b.fg();

	}
}
