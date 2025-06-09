package p08functional;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class P5Demo {
    public static void main(String[] args) {
    	
        IntBinaryOperator add = (x, y) -> x + y;
        System.out.println( add.applyAsInt(3, 4)); 
        
        DoubleBinaryOperator sub = (x, y) -> x - y;
        System.out.println( sub.applyAsDouble(10.5, 4.2)); 
        
        LongBinaryOperator mul = (x, y) -> x * y;
        System.out.println( mul.applyAsLong(10, 4)); 
         
    }
}
