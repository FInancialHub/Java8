package Classandmethods;

public class This {
	int e;
	int u;
	int q;
	
This()
{
	

}

This(int e,int u)
{
this.e=e;
this.u=u;
	
	}
This(int e,int u,int v)
{
	
	
	}
int y()
{
	return (this.e=8);
}
	

@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
}
	public static void main(String[] args) {
		
This t=new This();
int y=t.y();
System.out.println(y);

	}

}
