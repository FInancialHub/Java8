package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class file {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File f = new File(
				"C:\\Documents and Settings\\sanjay\\Desktop\\UPGTS32.EXE.part");
		System.out.println(f.canRead());

		try {
			FileWriter o = new FileWriter("C:\\sanjay.doc");

			o.write("sanjay");
			o.close();

			FileReader i = new FileReader("C:\\sanjay.txt");
			BufferedReader p = new BufferedReader(i);

			InputStream t=new DataInputStream(System.in) ;
			
			System.out.println(i.equals(o));
			String s;
			while ((s = p.readLine()) != null) {
				System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
