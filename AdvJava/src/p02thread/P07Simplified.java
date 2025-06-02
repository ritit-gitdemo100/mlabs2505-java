package p02thread;

//Using Thread, since required different logic with each thread

public class P07Simplified {
    public static void main(String[] args) {

        Thread otpThread = new Thread(() -> {
            for (int i = 1; i <= 25; i++) {
                System.out.println("Generating OTP " + i);
            }
            System.out.println("OTP sent to user.");
        });

        Thread logThread = new Thread(() -> {
            for (int i = 1; i <= 25; i++) {
                System.out.println("Logging background event " + i);
            }
            System.out.println("Background logging complete.");
        });

        otpThread.setPriority(Thread.MAX_PRIORITY);  // 10
        logThread.setPriority(Thread.MIN_PRIORITY);  // 1

        otpThread.start();
        logThread.start();
    }
}
