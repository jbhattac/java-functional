import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3);

    System.out.println(numbers.stream()
      .map(e -> e + 1)
      .collect(toList()));
      
    // 1 -> 2
    // 2 -> 3
    // 3 -> 4
    //result: 2, 3, 4

    System.out.println(numbers.stream()
      .flatMap(e -> Arrays.asList(e - 1, e + 1).stream())
      .collect(toList()));
      
    // 1 -> 0, 2
    // 2 -> 1, 3
    // 3 -> 2, 4
    //result: 0, 2, 1, 3, 2, 4

    //result for element 1, the result for element 2, ...
  }
}
