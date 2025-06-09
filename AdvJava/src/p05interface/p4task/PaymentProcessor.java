package p05interface.p4task;


public class PaymentProcessor {
    public static void main(String[] args) {
    	
        Payment payment1 = new CreditCardPayment();
        payment1.pay(1500);

        Payment payment2 = new UpiPayment();
        payment2.pay(-200);  

        payment2.pay(700);   
        
    }
}
