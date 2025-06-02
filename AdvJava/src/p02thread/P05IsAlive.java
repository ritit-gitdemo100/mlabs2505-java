package p02thread;

class FileDownloader extends Thread {
    public void run() {
        try {
            System.out.println("Download started...");
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(1000); 
                System.out.println("Downloaded " + (i * 20) + "%");
            }
            System.out.println("Download completed.");
        } catch (InterruptedException e) {
            System.out.println("Download interrupted.");
        }
    }
}

public class P05IsAlive {
    public static void main(String[] args) throws InterruptedException {
        FileDownloader downloader = new FileDownloader();
        downloader.start();

        // Monitor the download status
        while (downloader.isAlive()) {
            System.out.println("Download is still in progress...");
            Thread.sleep(500); // Polling every 0.5 seconds
        }

        System.out.println("Main thread: Confirming download is complete.");
    }
}
