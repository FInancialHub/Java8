import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;


public class Fibo  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		int i=0;
		int j=1;
		int k=0;
		
		System.out.println(i);
		System.out.println(j);
		
		LinkedList<Integer> s=new LinkedList<Integer>();
		
		
		for(int p=0;p<=24;p++)
		{
		k=i+j;
		System.out.println(k);
		s.add(k);
		i=j;
		j=k;
			
		}
		
		
		System.out.println(s);
		System.out.println(s.get(10));
		
		
		
		int e=5;
		
		if(e/2==0)
		{System.out.println("even");
		}
		else {System.out.println("odd");
			
		}

	}

}
