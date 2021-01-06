import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      
    List<Integer> doubleOfEven = numbers.stream()
      .filter(e -> e % 2 == 0)
      .map(e -> e * 2)
      .collect(toList());

    System.out.println(doubleOfEven);

    //collect is a reduce operation as well
  }
}


/*
    filter            map            reduce
x1    |           		  init(0)
----------------------------------------\-----------
x2------------------> y2 -------------> op
------------------------------------------\---------
x3    |                                    \
--------------------------------------------\-------
x4------------------> y4------------------> op
----------------------------------------------\-----
x5    |                                        \
------------------------------------------------\---
x6------------------> y6 ---------------------> op
                                                 \---> result

                ei
                |
    init -----> op ------------->
          ^           |
          |           |
	  ------------
*/
