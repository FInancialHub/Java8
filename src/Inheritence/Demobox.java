package Inheritence;

class Box {
	double i;
	double j;
	double k;

	Box() {
		j = 1;
		i = 5;
		k = 8;
	System.out.println("Box area(def)="+(i*j*k));
	}

	Box(Box c) {
		i=c.i;
		j = c.j;
		k = c.k;
		System.out.println("Box area(object)="+(i*j*k));
	}

	Box(double l) {
		i = j = k = l;
		System.out.println("Box area(l)="+(l*i*j*k));
	}

	Box(double y, double e, double q) {
		i = y;
		j = e;
		k = q;
		System.out.println("Box area(y,e,q)="+(i*j*k));
	}

	void ff()
	{
	System.out.println("Box area="+(i*j*k));	
	}
}

	class Boxweight extends Box {
		double w;

		Boxweight() {
			super();
			w = 5;
			System.out.println("Boxweight area(def)="+(i*j*k*w));
		}

		Boxweight(Boxweight s) {
			super(s);
			w=s.w ;
			System.out.println("Boxweight area(obj)="+(i*j*k*w));
		}

		Boxweight(double y, double e, double q, double a) {
			super(y, e, q);
			w=a ;
			System.out.println("Boxweight area(3 values)="+(i*j*k*w));
		}
}

public class Demobox {

	
	public static void main(String[] args) {
		
Box f=new Box();
Box f1=new Box(2.3);
Box f2=new Box(2.3,5,6.3);
Box f3=new Box(f);

Boxweight d=new Boxweight();
Boxweight d1=new Boxweight(d);
Boxweight d2=new Boxweight(4.5,6.6,5.3,12.3);
		
		
	}

}
