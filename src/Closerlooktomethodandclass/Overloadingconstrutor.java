package Closerlooktomethodandclass;

public class Overloadingconstrutor {
	double d;
	double e;
	double q;

	 Overloadingconstrutor() {
		 d=1;
		 e=2;
		 q=3;
	}
	 Overloadingconstrutor(int i)
	 {
		 d=e=q=i;
	 }
	 Overloadingconstrutor(int o,int y)
	 {this();
		d=o;
		e=y;
		
	 }
	
	 void vloume()
	 {
		 System.out.println(d*q*e);
	 }
	
	
	public static void main(String[] args) {
		Overloadingconstrutor o1=new Overloadingconstrutor();
		Overloadingconstrutor o2=new Overloadingconstrutor(4);
		Overloadingconstrutor o3=new Overloadingconstrutor(5,6);
		
		System.out.println("lasjdioasd"+(20^3));
		o1.vloume();
		o2.vloume();
		o3.vloume();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(d);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(e);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(q);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Overloadingconstrutor other = (Overloadingconstrutor) obj;
		if (Double.doubleToLongBits(d) != Double.doubleToLongBits(other.d))
			return false;
		if (Double.doubleToLongBits(e) != Double.doubleToLongBits(other.e))
			return false;
		if (Double.doubleToLongBits(q) != Double.doubleToLongBits(other.q))
			return false;
		return true;
	}

}
