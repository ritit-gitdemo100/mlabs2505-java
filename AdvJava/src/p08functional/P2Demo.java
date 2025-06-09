package p08functional;

@FunctionalInterface
interface Apple<T> {
    void disp(T data);
}


public class P2Demo {
    public static void main(String[] args) {
    	
    	  Apple<Integer> print = x -> System.out.println(x);
          print.disp(5);
      	
          Apple<Integer> sqr = x -> System.out.println(x*x);
          sqr.disp(5);
      	
          Apple<Integer> cube = x -> System.out.println(x*x*x);
          cube.disp(5);
      	
          Apple<Integer> next = x -> System.out.println(++x);
          next.disp(5);
      	
          Apple<Integer> prev = x -> System.out.println(--x);
          prev.disp(5);     
    }
}
