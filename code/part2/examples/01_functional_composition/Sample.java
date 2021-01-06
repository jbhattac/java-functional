import java.util.*;
import java.util.function.*;

public class Sample {  
  public static void printInfo(int number, String msg, 
    Function<Integer, Integer> func) {

    System.out.println(number + " " + msg + ": " + func.apply(number));
  }

  public static void main(String[] args) {
    //Unix pipeline      
    // cat myfile.txt | grep "someword" | wc -l
    // air -> purifier -> heater ->...
    // water -> purifier -> cooler ->...

    Function<Integer, Integer> inc = e -> e + 1;
    printInfo(5, "incremented", inc);
    printInfo(6, "incremented", inc);

    Function<Integer, Integer> doubleIt = e -> e * 2;
    printInfo(5, "doubled", doubleIt);
    printInfo(6, "doubled", doubleIt);

    printInfo(5, "incremented and doubled", inc.andThen(doubleIt));
    printInfo(6, "incremented and doubled", inc.andThen(doubleIt));

    Function<Integer, Integer> incAndDoubleIt = inc.andThen(doubleIt);
  }
}
