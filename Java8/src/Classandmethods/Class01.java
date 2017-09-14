package Classandmethods;

public class Class01 {
	int w;
	int i;
	int u;

void volume()
{
	
	System.out.println(w);
	volume(5,6);
}
 void volume(int o,int y)
{
System.out.println((o*y));
}
void volume(int o,int y, int i)
{

}

	public static void main(String[] args) {
	
		Class01 c=new Class01();
		c.volume();
		c.volume(5,6);
	
		c.w=9;
		c.i=8;
		c.u=10;
		int vol=c.w*c.i*c.u;
		System.out.println(vol);
		
		Class01 c1=new Class01();
		c1.w=6;
		c1.i=8;
		c1.u=10;
		int voll=c1.w*c1.i*c1.u;
		System.out.println(voll);
		
	}

}
