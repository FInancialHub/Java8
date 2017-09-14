package EceptionHandling;

//This program contains an error and will not compile.
class ThrowsDemo {
	static void throwOne() {
		System.out.println("Inside throwOne.");
		//throw new IllegalAccessException("demo");
		 throw new ArithmeticException();
	}

	public static void main(String args[]) {
		throwOne();
	}
}
