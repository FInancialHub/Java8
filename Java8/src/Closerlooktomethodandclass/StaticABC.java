package Closerlooktomethodandclass;

public class StaticABC {

	/**
	 * @param
	 */
	static int i = 5;
	int j = 7;
	static int y = 8;
	private static int p = 5;
	static {

		System.out.println("here");
		// System.out.println("j::"+j);
		System.out.println("i::" + i+j);
	}

	public static void main(String[] args) {

		StaticABC x1 = new StaticABC();
		System.out.println("i000:::" + i);
		System.out.println("j000:::" + j);
		ffff();
		

	}

static void ffff() {
		System.out.println(p);

	}

}

class Adcv {
	public static void main(String[] args) {

StaticABC.ffff();
		System.out.println(StaticABC.y);
	}
}
