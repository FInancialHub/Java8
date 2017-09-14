package Wrapperclass;

import java.io.*;

public class Wrap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Double d=new Double("56456125");
		Double d1=new Double("5645");
		
		System.out.println(d.equals(d1));
		String i="a";
		
		char a[]={};
		String s56="sanjy";
		Byte b=new Byte("sanjay");
		DataInputStream d3= new DataInputStream(System.in);
		
		try{
			
		i=(d3.readLine());
		
		}
		catch (Exception e) {{}
			System.out.println("no such no");
		}
		
		System.out.println(i);
	}

}
