
public class value {

	int i;
	int y;
	public static void main(String[] args) {
		int i;
		int y;
		value r=new value();
		value e=new value(r);
		e.f(1, 1);
		System.out.println(e.i);
		System.out.println(e.y);
	}
value() {
	// TODO Auto-generated constructor stub
}
	value(value t)
	{i=t.i;
	y=t.y;
		
	}
	void f(int u,int r)
	{
		i+=u;
		y+=r;
		
	}
}
