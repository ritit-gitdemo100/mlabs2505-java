package p02thread;

import java.util.concurrent.locks.ReentrantLock;

//ReentrantLock - more fine-grained control over locking
	//Ability to try locking without blocking indefinitely.
	//Interruptible locking if the thread needs to be interrupted.

class Counter3 {
	int count = 0;

    private final ReentrantLock lock = new ReentrantLock(); 

    public void increment() {
    	//statements
        lock.lock();  // Acquire the lock
        try {
            count++;  // Critical section
        } finally {
            lock.unlock();  // Ensure the lock is released
        }
        //statements
    }

}

public class P11ReentrantLock {
	public static void main(String[] args) throws InterruptedException {

		Counter3 counter = new Counter3();

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
