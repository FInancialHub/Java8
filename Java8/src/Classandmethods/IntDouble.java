package Classandmethods;

public class IntDouble {
int e;
int u;
int s;

	int volume()
	{
		return(e*u*s);
	}
	
	float voume()
	{
		return(e*u*s);
	}
	
float volume (int u,int e)
	{
		
		return(u*e);
	}
	
	public static void main(String[] args)
	{
		IntDouble i=new IntDouble();
		i.e=9;
		i.u=9;
		i.s=9;
		
		int vol=i.volume();
		Float vo=i.voume();
		System.out.println(vol);
		System.out.println(vo);
	
		 double voll=i.volume(5,4);
		System.out.println(voll);
	}
	
	

}
