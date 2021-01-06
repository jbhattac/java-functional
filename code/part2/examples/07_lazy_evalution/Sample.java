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


    //find the double of the first number greater than 3 and is even

    //imperative
    Integer result = null;

    for(int e: numbers) {
      if(isGT(e) && isEven(e)) {
        result = doubleIt(e);
	break;
      }
    }

    //how much work is done above?
    // 8 units of works

    System.out.println(result);

    System.out.println("-----------");

    //Function
    System.out.println(
      numbers.stream()
        .filter(Sample::isGT)
        .filter(Sample::isEven)
        .map(Sample::doubleIt)
	.findFirst()
	.orElse(0));

    //to the human eye this looks like we did 21 units of work
    //some languages actually do that. These are functional style
    //languages

    //But, functional programming languages do not do that much work
    //These langauges use lazy evaluation

    //Stream does not compute each function for all the data.
    //Instead, it fuses the functions into one and executes
    //a collection of functions for each data, but only as little as
    //needed.

    //Remember, Stream is not a collection of data.

    //List					Stream
    //Bucket of data			    Pipeline of functions


    //Lazy == effciciency

    //There are two kinds of function:
    //intermediate and terminal functions
    //intermediate function fuse together but do not run
    //terminal functions trigger the evaluation, but minimally


    //The amount of work done by functional is the same as that done
    //by imperative (both when correctly done)
    //Functional is easier to understand, maintain, and parallelize.
  }
}
