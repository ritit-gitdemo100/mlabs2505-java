package p08functional;

@FunctionalInterface
interface Peacock<T> {
    boolean check(T input);
}

public class P3Demo {
    public static void main(String[] args) {
        
      	Peacock<Integer> isEven = number -> number % 2 == 0;
          System.out.println(isEven.check(4));
          
      	Peacock<Integer> isVote = age -> age >= 18;
          System.out.println(isVote.check(24));
          
      	Peacock<Integer> isPass = mark -> mark >= 40;
          System.out.println(isPass.check(55));
          
    }
}
