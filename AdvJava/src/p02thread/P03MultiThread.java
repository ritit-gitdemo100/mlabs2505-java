package p02thread;

//MultiThread

class FoodOrder implements Runnable {

	public void run() {
		
		String threadName = Thread.currentThread().getName();
		
			for(int i=1; i<=10; i++) {
				System.out.println(threadName+" : Processing - "+i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {

				}
			}
		
	}
}

public class P03MultiThread {
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName()+" started...");
		FoodOrder foodOrder = new FoodOrder();
		
		Thread order1 = new Thread(foodOrder);
		Thread order2 = new Thread(foodOrder);
		Thread order3 = new Thread(foodOrder);
		
		order1.start();
		order2.start();
		order3.start();
		
		System.out.println(Thread.currentThread().getName()+" completed...");
		System.out.println("Thank you");
	}
}
