package EceptionHandling;

class AAA {

	static void f1() {
		NullPointerException n = new NullPointerException();

		n.initCause(new ArithmeticException("cause"));
		throw n;

	}
}

public class Chainedexception {

	public static void main(String[] args) {

		try {
			AAA.f1();

		} catch (NullPointerException e) {
			System.out.println("caught== " + e);
			System.out.println("cause==" + e.getCause());
		}

	}

}
