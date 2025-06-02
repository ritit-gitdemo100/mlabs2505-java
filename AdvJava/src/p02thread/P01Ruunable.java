package p02thread;

//Runnable Intro

class MyTask1 implements Runnable {

	public void run() {
		System.out.println("Welcome");
	}
}

public class P01Ruunable {
	public static void main(String[] args) {
		
		MyTask1 task = new MyTask1();
		
		Thread task1 = new Thread(task);
		task1.start();
	}
}
