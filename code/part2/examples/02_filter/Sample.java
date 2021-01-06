import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      
    //Stream is an internal iterator
    numbers.stream()
      .filter(e -> e % 2 == 0)
      .forEach(e -> System.out.println(e));
  }
}

//Filter takes a predicate
//it allows only values that satifify the predicate to move on

// 0 <= # of elements in the output <= # of elements in the output
// output is a subset of the input
