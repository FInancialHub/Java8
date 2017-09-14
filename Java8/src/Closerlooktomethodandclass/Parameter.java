package Closerlooktomethodandclass;

public class Parameter {
	int y;
	int u;

	Parameter() {
y=1;
u=1;
	}

	Parameter(int i) {
		this();
y=i;
throw new 
 	}

	Parameter(int o, int p) {
		y=o;
		u=p;

	}
	Parameter(Parameter p6)
	{
		y=p6.y;
		u=p6.u;
	}
	void f88(Parameter o)
	{
		o.y=y;
		o.u=u;
	}
	void volume ()
	{
		System.out.println(y*u);
	}
	

	public static void main(String[] args) {
		Parameter p = new Parameter();
		Parameter p1 = new Parameter(8,9);
		Parameter p2 = new Parameter(p1);

		p.volume();
		p1.volume();
		p2.volume();
		
		
	}

}
