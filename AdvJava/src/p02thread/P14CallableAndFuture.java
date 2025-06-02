package p02thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Callable<v> is a functional interface similar to Runnable, 
//but it Returns a result (of type V), Can throw checked exceptions

//Future<V> represents the result of an asynchronous computation. 
//It's returned when you submit a Callable to an ExecutorService.

public class P14CallableAndFuture {

	public static void main(String[] args) throws Exception {

		ExecutorService executor = Executors.newSingleThreadExecutor();

		Callable<String> task = () -> {
			Thread.sleep(5000); 
			return "Task Completed Successfully!";
		};

		Future<String> future = executor.submit(task);

		// Monitor the task status every second
		while (!future.isDone()) {
			System.out.println(" Task is still running...");
			Thread.sleep(1000);
		}

		System.out.println(" Task completed. Result: " + future.get());

		executor.shutdown();
	}
}
