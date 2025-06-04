package p02thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class OrderProcessor implements Runnable {
    private final String orderId;

    public OrderProcessor(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        System.out.println("Processing order: " + orderId + " on thread " + Thread.currentThread().getName());
        
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
        }
        System.out.println("Order " + orderId + " processed.");
    }
}

public class P13ExecutorService {
    public static void main(String[] args) {

    	//Only a pool of 3 threads handle 10 tasks
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Simulate receiving 5 orders
        for (int i = 1; i <= 10; i++) {
            OrderProcessor task = new OrderProcessor("Order#" + i);
            executor.submit(task);
        }

        executor.shutdown();
       
    }
}
