package p08functional;

@FunctionalInterface
interface Sunday<T> {
    T calc(T a, T b);
}

public class P4Demo {
    public static void main(String[] args) {
    	
        Sunday<Integer> add = (x, y) -> x + y;
        System.out.println( add.calc(3, 4)); 
        System.out.println( add.calc(10, 4));  
        
        Sunday<Integer> sub = (x, y) -> x - y;
        System.out.println( sub.calc(10, 4)); 
        
        Sunday<Integer> mul = (x, y) -> x * y;
        System.out.println( mul.calc(10, 4)); 
         
    }
}
