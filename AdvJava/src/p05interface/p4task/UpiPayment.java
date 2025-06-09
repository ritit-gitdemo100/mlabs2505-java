package p05interface.p4task;


public class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        if (Payment.isValidAmount(amount)) {
            System.out.println("Paid ₹" + amount + " using UPI.");
            generateReceipt(amount);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }
}
