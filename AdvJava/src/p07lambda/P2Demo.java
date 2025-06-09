package p07lambda;

import java.util.function.Consumer;

public class P2Demo {
    public static void main(String[] args) {
    	
    	  Consumer<Integer> print = x -> System.out.println(x);
          print.accept(5);
      	
          Consumer<Integer> sqr = x -> System.out.println(x*x);
          sqr.accept(5);
      	
          Consumer<Integer> cube = x -> System.out.println(x*x*x);
          cube.accept(5);
      	
          Consumer<Integer> next = x -> System.out.println(++x);
          next.accept(5);
      	
          Consumer<Integer> prev = x -> System.out.println(--x);
          prev.accept(5);     
    }
}
