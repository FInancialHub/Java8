package Classandmethods;

public class Addmethod {

	int o;
	int p;
	int l;
	
	void volume ()
	{
		System.out.println((o*p*l));
	}
	
	
	int volume (int a)
	{
		
		return ((a));
		//System.out.println((a*u));
	}
	
void  volume (int a,int u)
	{
		
		
		System.out.println((a*u));
	}
	
	public static void main(String[] args) {
	Addmethod a1=new Addmethod();
	a1.volume(4);
	
	a1.l=9;
	a1.o=8;
a1.p=1;
	
	a1.volume();
		
		
	}

}
