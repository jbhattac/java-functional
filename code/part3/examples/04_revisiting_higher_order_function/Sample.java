import java.util.*;
import java.util.function.*;

public class Sample {  
  public static Function<Integer, Predicate<Integer>> createCheck() {
    //Function<Integer, Predicate<Integer>> checkFactory =
    //  (Integer pivot) -> (Integer value) -> value > pivot;

    //return checkFactory;

    return pivot -> value -> value > pivot;
  }
  //createCheck is a function that returns a function
  //Functions can take lambdas as arguments, may create lambdas internally,
  //may return lambdas as well
  
  public static void main(String[] args) {
    Function<Integer, Predicate<Integer>> create = createCheck();

    Predicate<Integer> check1 = create.apply(3);
    Predicate<Integer> check2 = create.apply(5);

    System.out.println(check1.test(2));
    System.out.println(check1.test(4));

    System.out.println(check2.test(2));
    System.out.println(check2.test(4));
  }
}
