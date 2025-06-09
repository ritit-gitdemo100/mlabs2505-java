package p05interface.p4task;


public class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        if (Payment.isValidAmount(amount)) {
            System.out.println("Paid ₹" + amount + " using Credit Card.");
            generateReceipt(amount);
        } else {
            System.out.println("Invalid payment amount.");
        }
    }
}
