package p05interface.p4task;


public interface Payment {
	
    void pay(double amount);

    default void generateReceipt(double amount) {
        System.out.println("Receipt: Paid ₹" + amount + ". Thank you for your payment.");
    }

    static boolean isValidAmount(double amount) {
        return amount > 0;
    }
}
