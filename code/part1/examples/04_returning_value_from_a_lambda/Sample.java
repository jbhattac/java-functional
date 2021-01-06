import java.util.*;
import java.util.concurrent.*;

public class Sample {  
  public static int compute() {
    System.out.println("compute called...");
    return 4;
  }

  public static void main(String[] args) throws Exception {
    //Callable<Integer> callable = () -> 2;
    Callable<Integer> callable = () -> compute();
    //Callable<Integer> callable = Sample::compute;

    System.out.println(callable.call());
  }
}
