package p02thread;

import java.util.concurrent.atomic.AtomicInteger;

class Counter4 {
    AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.incrementAndGet(); 
    }
}

public class P12AtomicVar {
    public static void main(String[] args) throws InterruptedException {

        Counter4 counter = new Counter4();

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

        System.out.println("Count: " + counter.count.get());
    }
}
