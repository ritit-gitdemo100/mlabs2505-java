package p02thread;

class OTPGenerationThread extends Thread {
	public void run() {
		for (int i = 1; i <= 25; i++) {
			System.out.println("Generating OTP " + i);
		}
		System.out.println("OTP sent to user.");
	}
}

class BackgroundLoggerThread extends Thread {
	public void run() {
		for (int i = 1; i <= 25; i++) {
			System.out.println("Logging background event " + i);
		}
		System.out.println("Background logging complete.");
	}
}

public class P06Priority {
	public static void main(String[] args) {
		OTPGenerationThread otpThread = new OTPGenerationThread();
		BackgroundLoggerThread logThread = new BackgroundLoggerThread();

		// Set priorities
		otpThread.setPriority(Thread.MAX_PRIORITY); // 10
		logThread.setPriority(Thread.MIN_PRIORITY); // 1

		// Start threads
		otpThread.start();
		logThread.start();
	}
}
