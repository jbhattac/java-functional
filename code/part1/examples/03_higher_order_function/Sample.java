import java.util.*;

public class Sample {  
  /*
    Functions:
      we can pass objects to a function
      we can create objects in a function
      we can return objects from a function

    Higher-Order functions:
      we can pass functions to a function
      we can create functions in a function
      we can return functions from a function


    In addition to doing object decomposition we can also do
    functional decomposition
  */

  public static void main(String[] args) {
    //Thread th = new Thread(new Runnable() {
    //  public void run() {
    //    System.out.println("In another thread");
    //  }
    //});

    Thread th = new Thread(() -> System.out.println("In another thread"));


    //Thread is a higher-order function because it receives another
    //function (anonymous function) as a parameter.

    th.start();

    System.out.println("In main");
  }
}
