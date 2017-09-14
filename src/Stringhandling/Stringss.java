package Stringhandling;

public class Stringss {
	
	
	//string//=========
	public static void main(String[] args) {
	char b[]={'s','a','n','j','a','y'};
		String s= new String(b);
		String s1= new String(b,2,3);
		String s89= new String("sanjay");
		System.out.println(s);
		System.out.println(s1);
		if(true)
			System.out.println("hi");
		
		String s2= new String(s);
		System.out.println(s2);
		
		byte a[]={65,63,68,69,67,64};
		String s3= new String(a);
		System.out.println(s3);
		
		String s4= new String(b);
		System.out.println(s4.length());
		

	
	
		String s5= "sanjay";
		String s235= "asfhdasgfdahdasd::"+(s5.length());
		String s345= "asfhdasgfdahdasd::6";
		System.out.println(s235==s345);
		System.out.println(s235.equals(s345));
		
		System.out.println("s5;"+s5.length());
		System.out.println("sanjay".length());
		
		int p=6;
		String s6= "  I am    "+p+"    years old="+p+p;
		System.out.println(s6);
		String s7= "I am "+p+" years old="+(p+p);
		System.out.println(s7);
		
		
		
		//special fumction//=======
		System.out.println(s5.charAt(3));
		
		char ba[]={'s','a','n','j','a','y'};
		String s8= new String(ba);
		char as[]=new char[3-0];
		s8.getChars(0, 3, as, 0);
		System.out.println(as);
		
		System.out.println(s7.getBytes());
		System.out.println(s7.toCharArray());
		
		
		
		//boolean  T  or F//=====
		String s9= "sanjay";
		String s10= "SANJay";
		String s11="sanjay";
		String s12= "hello";
		System.out.println(s9.equals(s10));
		System.out.println(s9.equals(s11));
		System.out.println(s9.equals(s12));
		System.out.println(s9.equalsIgnoreCase(s10));
		
		String s13= "sanjay";
		String s14= "SANJAY";
		System.out.println(s14.regionMatches(0, s13, 0, 6));
		System.out.println(s14.regionMatches(true, 0, s13, 0, 6));
		
		
		System.out.println("SANJAY".startsWith("mr"));
		System.out.println("sanJAY".startsWith("san"));
		
		System.out.println(s9.equals(s10));
		System.out.println(s9.equals(s11));
		System.out.println(s9.equals(s12));
		System.out.println(s9.equalsIgnoreCase(s10));
		String s15=new String(s9);
		System.out.println("chech =="+s9==s15);
		
		System.out.println(s9.compareTo(s12));
		
		
		//search//====
		System.out.println(s6.indexOf('y'));
		System.out.println(s6.lastIndexOf("I"));
		
		
		//substring//==
		String s16= "      sanjay devalia       ";
		System.out.println(s16.substring(1, 3));
		
		System.out.println(s9.concat(" devalia"));
		
		System.out.println(s9.replace("san", "jay"));
		
		System.out.println(s9);
		
		System.out.println(s16);
		System.out.println(s16.trim());
		
		
		
		//data conversion//===
		System.out.println(s12=s12.valueOf("sanjayanshfsfs"));
		System.out.println(s12);
		
		//changing the case//====
		System.out.println(s14.toLowerCase());
		System.out.println(s13.toUpperCase());
		
		//string buffer//======
		StringBuffer sb=new StringBuffer("sanjay");
		System.out.println("lenght="+sb.length());
		System.out.println("capacity="+sb.capacity());
		sb.ensureCapacity(3);
		System.out.println(sb);
		sb.setLength(5);
		System.out.println(sb);
		System.out.println(sb.charAt(3));
		sb.setCharAt(3,'p');
		System.out.println(sb);
		
		
		System.out.println(sb.append(9).append("san").append(s13));
		System.out.println(sb.insert(1, "o"));
		System.out.println(sb.reverse());
		System.out.println(sb.delete(0, 2));
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb.replace(0, 13, "sanjay"));
		
		System.out.println(sb.substring(3));
		
		System.out.println(sb.substring(0, 3));
		
		System.out.println(sb);
		
		
		
		String san= "SANJay";
		String jay="sanjay";
	
		System.out.println(jay=="SANJay");
		
		
		System.out.println(	san.equals("SANJay"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
