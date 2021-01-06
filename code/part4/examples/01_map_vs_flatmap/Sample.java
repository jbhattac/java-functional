import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);      
    System.out.println(numbers);

    //map
    //Stream<T>.map(Function<T, R>) ===> Stream<R>

    //if you have a one-to-one function FTR, then map
    //transforms from a Stream<T> to a Stream<R>.

    List<Integer> result1 = numbers.stream()
      .map(e -> e + 1)
      .collect(toList());

    System.out.println(result1);


    //if you have a one-to-many function FTList<R>, then
    //map transforms from a Stream<T> to Stream<List<R>>
    //if that is what you want, you got it
    List<List<Integer>> result2 = numbers.stream()
      .map(e -> Arrays.asList(e - 1, e + 1))
      .collect(toList());
    System.out.println(result2);

    //if you have a one-to-many function, FTList<R>,
    //but you want to transform a Stream<T> to a Stream<R>
    //and not a Stream<List<R>>, then what?
    List<Integer> result3 = numbers.stream()
      .flatMap(e -> Arrays.asList(e - 1, e + 1).stream())
      .collect(toList());
    System.out.println(result3);

   //If you have a one-to-one function then use map.
   //If you have a one-to-many function, and want a collection 
   //as a result and not a collection of collection, then
   //use flatmap.
   //one to one vs. one to many


   //given a collection of people I want their first names - map
   //given a collection of people I want their email addresses - flatMap
  }
}
