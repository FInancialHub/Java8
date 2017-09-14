package EceptionHandling;

class Abd extends Exception {
	int e;

	Abd(int y) {
		e = y;
	}

	public String toString() {

		System.out.println("Abd" + e);
		return super.toString();
	}
}

public class Ownexception {

	static void ffff(int a) throws Abd {
		System.out.println("caught" + a);
		if (a == 0) {
			throw new Abd(a);

		} else {
			System.out.println("normal exit");

		}

	}

	public static void main(String[] args) {

		try {
			ffff(23);
			ffff(0);

		} catch (Abd e) {
			
			System.out.println("now "+e);

		}

	}
}
