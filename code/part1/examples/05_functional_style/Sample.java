import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    //Functional style == declarative + higher-order functions
      
    List<String> names = Arrays.asList("Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");  

    //are there names of length 5?

    System.out.println(names.stream()
      .anyMatch(name -> name.length() == 5));

    //anyMatch is a higher-order function
    //anyMatch is declarative - tell what and not how


    //When programming in Functional style, look for functions
    //that express the desired result and make use of them.
    //Look for higher-order functions.
  }
}
