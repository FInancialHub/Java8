public class LOOP {

	public static void main(String[] args) {

		String s = "";
		String s2 = "";

		for (int i = 0; i < 4; i++) {
			for (int j = 0 ; j < i+1; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		for (int i = 4; i > 0; i--) {
			for (int j = 0 ; j < i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		/*
		 * for(int i=1;i<6;i++){
		 * 
		 * for(int j=i ; j<6;j++){ String s1 = ""+j; s=s+s1; } if(i==1){ s2=s;
		 * }else{ s=s+s2.substring(0,i-1); } System.out.println(""+s); s=""; }
		 */
	}
}
