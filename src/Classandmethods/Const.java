package Classandmethods;

public class Const {
int y;
int u;
int e;

 Const() 
{
	y=8;
	u=7;
	e=2;
	 
}
 
 Const(int w,int r)
 {
	 y=w;
	 u=r;
	 this.e=1;
 }
	int volume()
	{
		y=5;
		
	return ((y*u*e));
	
	}
 
 public static void main(String[] args) {
		
Const c3=new Const();
int vol=c3.volume();
System.out.println(vol);

Const c6=new Const(5,9); 
int voll=c6.volume();
System.out.println(voll);
	}

}
