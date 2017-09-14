package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Synchronised implements Runnable {

	private final ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) {
		Synchronised ff = new Synchronised();
		Thread a = new Thread(ff);
		Thread aaa = new Thread(ff);
		a.start();
		aaa.start();
	}

	@Override
	public void run() {

		//fffs();

		fff();
	}

	synchronized void fff() {
		System.out.println("1bas");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	static synchronized void fffss() {
		System.out.println("1bas");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	void fffs() {
		boolean done = false;
		while (!done) {
			boolean ans = lock.tryLock();
			if (ans) {
				try {
					System.out.println("1ba456464s::" + Thread.currentThread().getName() + lock.getHoldCount());
					System.out.println("1ba456464s::" + Thread.currentThread().getName() + lock.isLocked());
					Thread.sleep(4000);
					System.out.println("1ba456464s::" + Thread.currentThread().getName() + lock.getHoldCount());
					System.out.println("1ba456464s::" + Thread.currentThread().getName() + lock.isLocked());

					Thread.sleep(8000);
					done = true;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					lock.unlock();
				}
			} else {
				System.out.println("task name - " + Thread.currentThread().getName() + " waiting for lock");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
