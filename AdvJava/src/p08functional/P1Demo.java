package p08functional;

import java.time.LocalDate;
import java.util.Random;


@FunctionalInterface
interface GetStuff<T> {
    T grab();
}

public class P1Demo {
    public static void main(String[] args) {
        
        GetStuff<Integer> number = () -> new Random().nextInt(100);
        System.out.println( number.grab());
        System.out.println( number.grab());
        System.out.println( number.grab());
        
    	GetStuff<Integer> otp = () -> 1000 + new Random().nextInt(9000);
        System.out.println(otp.grab());
        
        GetStuff<String> today = () -> LocalDate.now().toString();
        System.out.println( today.grab());
        
    }
}
