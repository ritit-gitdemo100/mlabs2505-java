package p02thread;

class Counter2 {
	int count = 0;

	// Synchronized Block
	public void increment() {
		//statements
		// Synchronizing only the critical section
		synchronized (this) {
			count++;
		}
		//statements
	}
}

public class P10SyncBlock {
	public static void main(String[] args) throws InterruptedException {

		Counter2 counter = new Counter2();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10000; i++)
				counter.increment();
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10000; i++)
				counter.increment();
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("Count: " + counter.count);
	}
}
