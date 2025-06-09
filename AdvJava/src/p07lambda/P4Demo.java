package p07lambda;

import java.util.function.BinaryOperator;

public class P4Demo {
    public static void main(String[] args) {
    	
        BinaryOperator<Integer> add = (x, y) -> x + y;
        System.out.println( add.apply(3, 4)); 
        System.out.println( add.apply(10, 4));  
        
        BinaryOperator<Integer> sub = (x, y) -> x - y;
        System.out.println( sub.apply(10, 4)); 
        
        BinaryOperator<Integer> mul = (x, y) -> x * y;
        System.out.println( mul.apply(10, 4)); 
         
    }
}
