package p07lambda;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Supplier;




public class P1Demo {
    public static void main(String[] args) {
        
        
    	Supplier<Integer> number = () -> new Random().nextInt(100);
 
    	System.out.println( number.get());
        System.out.println( number.get());
        System.out.println( number.get());
        
    	Supplier<Integer> otp = () -> 1000 + new Random().nextInt(9000);
        System.out.println(otp.get());
        
        Supplier<String> today = () -> LocalDate.now().toString();
        System.out.println( today.get());
        
    }
}
