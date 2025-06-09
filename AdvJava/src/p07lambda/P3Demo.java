package p07lambda;

import java.util.function.Predicate;

public class P3Demo {
    public static void main(String[] args) {
        
      	Predicate<Integer> isEven = number -> number % 2 == 0;
          System.out.println(isEven.test(4));
          
      	Predicate<Integer> isVote = age -> age >= 18;
          System.out.println(isVote.test(24));
          
      	Predicate<Integer> isPass = mark -> mark >= 40;
          System.out.println(isPass.test(55));
          
    }
}
