package p02thread;

//Join

class DataFetcher extends Thread {
    public void run() {
        try {
            System.out.println("Fetching data from remote server...");
            Thread.sleep(2000);  
            System.out.println("Data fetched successfully.");
        } catch (InterruptedException e) {
            System.out.println("Fetching interrupted.");
        }
    }
}

class DataProcessor extends Thread {
    public void run() {
        try {
            System.out.println("Processing data...");
            Thread.sleep(1500);  
            System.out.println("Data processed successfully.");
        } catch (InterruptedException e) {
            System.out.println("Processing interrupted.");
        }
    }
}

public class P04Join {
    public static void main(String[] args) throws InterruptedException {
        
    	DataFetcher fetcher = new DataFetcher();
        DataProcessor processor = new DataProcessor();

        fetcher.start();
        processor.start();

        // Wait for both tasks to complete
        fetcher.join();
        processor.join();

        // Only after both threads are finished
        System.out.println("Generating report based on fetched and processed data...");
        System.out.println("Report generation complete!");
    }
}
