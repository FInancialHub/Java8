package Threads;

public class Run {

	public static void main(String[] args) {

		PPP p=new PPP();
		PP p1=new PP();
		P p2=new P();
		p.setPriority(8);
		p1.setPriority(5);
		p2.setPriority(4);
		p.start();
		p1.start();
		p2.start();
	}

}

class PPP extends Thread {
	public void run() {
		for (int i = 3; i >= 0; i--) {
			System.out.println("it is " + i);///operation 
		}

	}

}

class PP extends Thread {
	public void run() {
		for (int i = 3; i >= 0; i--) {
			System.out.println("it is " + i);
		}
	}
}

class P extends Thread {
	public void run() {
		for (int i = 3; i >= 0; i--) {
			System.out.println("it is " + i);
		}
	}

}
