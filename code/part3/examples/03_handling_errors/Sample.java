import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    //exception handling is an imperative style of programming idea      

    //In function programming we work with a pipeline of functions
    //and data flows through these functions

    //Exception handling and functional programming are mutually exclusive

    //imagine a friend calls you saying "I have flat tire"
    //Worst answer: blowup the freeway and go back in reverse

    //Right answer: move forward, carefully, and safely exit the freeway

    //when there is an error, move downstream and exit safely
    //do not blow up

    //treat errors as data and deal with the error as a series of
    //transformations

    //Java has no answers.
    //Scala, Haskel, etc. have things like Either or Maybe monads
    //Vavr has some solutions too

    //Reactive APIs deal with this in a much better way by providing
    //a separate error channel.

    //Promises and Completable Future deal with this by providing
    //a separate channel as well
  }
}
