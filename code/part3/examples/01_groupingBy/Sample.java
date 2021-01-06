import java.util.*;
import static java.util.stream.Collectors.*;

public class Sample {  
  public static List<Person> createPeople() {
    return List.of(
	    new Person("Sara", 20),
	    new Person("Sara", 22),
	    new Person("Bob", 20),
	    new Person("Paula", 32),
	    new Person("Paul", 32),
	    new Person("Jack", 3),
	    new Person("Jack", 72),
	    new Person("Jill", 11));
  }

  public static void main(String[] args) {
    //get a map of names and ages, but only for those older than 20  

    System.out.println(createPeople()
      .stream()
      //.filter(person -> person.getAge() > 20)
      .collect(groupingBy(Person::getName)));
  }
}
