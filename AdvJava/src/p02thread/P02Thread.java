package p02thread;

//Thread Intro

class MyTask2 extends Thread {
	public void run() {
		System.out.println("Thread is running: " + Thread.currentThread().getName());
	}
}

public class P02Thread {
	public static void main(String[] args) {
				
		MyTask2 task1 = new MyTask2();
		task1.start();
	}
}
