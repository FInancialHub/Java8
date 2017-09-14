
public class Test11 {

	public static void main(String args[]) {
		I i = new Q();
		i.ti(1, 2);
	}
}

class I {
	int a;
	int b;

	I(I i) {
		a = i.a;
		b = i.b;
	}

	I() {
	}

	I(int i, int y) {
		System.out.println("sanjay 666" + i + y);
	}

	void ti(int r, int e) {
		a = r;
		b = e;
	}
}

class Q extends I {
	Q() {
	}

	Q(int p, int y) {
		System.out.println("sanjay 666" + a + b);
	}
}
