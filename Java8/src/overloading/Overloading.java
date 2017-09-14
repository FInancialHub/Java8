package overloading;

public class Overloading {
	
	public int func1(int i, double j) {
		// TODO Auto-generated method stub

		return 1;
	}
	public int func1(Object  i, double j) {
		// TODO Auto-generated method stub

		return 1;
	}

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Overloading().func1(1, 1);
	}

}
