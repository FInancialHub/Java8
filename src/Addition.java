import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Addition<E extends Object> {

	
	public static void main(String[] args) {
		Addition r = new Addition();

		ArrayList a = new ArrayList();

		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");

		System.out.println(a);

		Object[] q = a.toArray();
		
		int u = 0;
		for (int i = 0; i < q.length; i++) {
			u = u + ((Integer) (q[i]));
		}

	System.out.println(q);
	}

}
