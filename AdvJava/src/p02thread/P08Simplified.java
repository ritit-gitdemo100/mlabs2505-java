package p02thread;

//Using Runnable, since we need the same logic with multiple threads

public class P08Simplified {
	public static void main(String[] args) {
		
		Runnable deliveryTask = () -> {
			String agentName = Thread.currentThread().getName();
	
			System.out.println(agentName + " picked up Order ");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
				}
			System.out.println(agentName + " completed delivery.");
		};

		// Create and start multiple delivery agents
		Thread agent1 = new Thread(deliveryTask);
		Thread agent2 = new Thread(deliveryTask, "Agent-B");
		Thread agent3 = new Thread(deliveryTask, "Agent-C");

		agent1.start();
		agent2.start();
		agent3.start();
	}
}
