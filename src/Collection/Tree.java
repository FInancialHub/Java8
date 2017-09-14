package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tree {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		TreeSet<String> a = new TreeSet<String>();
		Timer t = new Timer();

		a.add("s");
		a.add("a");
		a.add("y");
		a.add("j");
		a.add("n");
		a.add("a");
		
		

		System.out.println("a=" + a);

		
		LinkedList<String> h=new LinkedList<String>();
		
		h.add("s");
		h.add("a");
		h.add("y");
		h.add("j");
		h.add("n");
		h.add("a");
		
		System.out.println(h.get(5));
		
		List<String> p = new ArrayList<String>();
		p.add("s");
		p.add("a");
		p.add("y");
		p.add("j");
		p.add("n");
		p.add("a");

		System.out.println("p=" + p.get(3));
		
		Set<String> sett=new LinkedHashSet<>(p);
		sett.stream().forEach(System.out::println);

		Map<String, Integer> m = new TreeMap<String, Integer>();

		m.put("sanjay", 123123);
		m.put("sanj", 52);
		m.put("sanj", 562);
		m.put("sa", 56);
		m.put("jay", 62);

		Set o = m.entrySet();

		Iterator i = o.iterator();

		while (i.hasNext()) {
			Object y = (Object) i.next();
			System.out.println(y);
		}

		
		m = new HashMap<String, Integer>();

		m.put("sanjay", 123123);
		m.put("sanj", 52);
		m.put("sanj", 562);
		m.put("sa", 56);
		m.put("jay", 62);
		m.put("sanjayadas", 123123);
		m.put("sanjsad", 52);
		m.put("sanjsasadd", 562);
		m.put("sasdasdadad", 56);
		m.put("jaysaasdadadad", 62);
	
		System.out.println("jsahgd::"+m);
	
	}

	
}
