package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Inte<T,K,V,E> {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	HashSet a = new HashSet();
		a.add("s");
		a.add("a");
		a.add("y");
		a.add("j");
		a.add("n");
		a.add("a");

		System.out.println("a=" + a);

		Iterator i = a.iterator();
while (i.hasNext()) {
	Object object = (Object) i.next();
	
}
	

		

		Iterator iy = a.iterator();

		
		while (iy.hasNext()) {
			Object obb = iy.next();
			System.out.print("  " + obb);

		}
		
		
	}

	void put(K key,V v){
		
	}
	
	void get(K key){
		
	}
}
