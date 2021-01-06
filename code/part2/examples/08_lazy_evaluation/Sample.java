import java.util.*;

public class Sample {  
  public static boolean isGT(int number) {
    System.out.println("isGT for " + number);
    return number > 3;
  }

  public static boolean isEven(int number) {
    System.out.println("isEven for " + number);
    return number % 2 == 0;
  }

  public static int doubleIt(int number) {
    System.out.println("doubleIt for " + number);
    return number * 2;
  }

  public static void main(String[] args) {
    //Functional Programming == Functional Composition + Lazy evaluation      
    List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

    numbers.stream()
     .filter(Sample::isGT)
     .filter(Sample::isEven)
     .map(Sample::doubleIt)
     //.findFirst() //above operations are lazy, and terminal triggers them
    ;

    System.out.println("DONE");
  }
}
