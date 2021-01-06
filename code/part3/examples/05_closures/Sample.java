import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    numbers.stream()
      .map(e -> e * 2) //lambda expression
      .forEach(System.out::println);

    //lambda expressions are stateless. They take an input (possibly)
    //work with the given parameter and constants, and return
    //a result (possibly)

    //lambdas are self sufficient.
    //e is a parameter and 2 is a constant, it needs nothing more

    final int factor = 2; 

    numbers.stream()
      .map(e -> e * factor) //This has an unbounded variable
      .forEach(System.out::println);

    // e -> e * factor - e is a parameter, have no clue what factor is

    //The lambda has to look around and bind to a variable named factor.
    //In other words, it has to "close over" the defining scope to 
    //bind to that variable. Thus, because it has to close-over, 
    //it is called a closure.

    //closures are lambdas that carry state. That state better be
    //immutable. Otherwise, parallel and lazy evalutions will fail
    //in unknown ways. Fully functional programming languages like
    //Haskell will not permit immurity in lambdas.

    //factor is used in the closure from the lexical scope
  }
}
