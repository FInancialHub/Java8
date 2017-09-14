package Closerlooktomethodandclass;


public class StaticXYZ extends StaticABC{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticABC x2=new StaticABC();
		StaticXYZ x3=new StaticXYZ();
		System.out.println("i00:::"+x2.i);
		System.out.println("j00:::"+x2.j);
		System.out.println("i11:::"+x3.i);
		System.out.println("j11:::"+x3.j);
		x2.i=6;
		x2.j=3;
		//i=0;
		System.out.println("i22:::"+x2.i);
		System.out.println("j22:::"+x2.j);
		System.out.println("i33:::"+StaticXYZ.i);
		System.out.println("j33:::"+x3.j);
		
		
		
		
		
		
		
		
		System.out.println("i*****:::"+x2.i);
		System.out.println("i#####:::"+x3.i);
		System.out.println("i*****11111:::"+x2.j);
		System.out.println("i#####22222:::"+x3.j);
}
}
