package Stringhandling;

public class SSS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s36 =new String("jjj");
		String s16= new String("jjj");
		
		
		System.out.println(s36.replace("j", "t"));
	
		String s26 ="jjj";
		
		
		
		System.out.println("check =="+(s36.intern()==s26));
		

	}

}
