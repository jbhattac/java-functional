import java.util.*;

public class Sample {  
  public static void main(String[] args) {
    List<String> names = Arrays.asList(
      "Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques");


    //Is Nemo there?

    //imperative style: we tell what to do and also how to do it
    boolean found = false;

    //for(int i = 0; i < names.size(); i++) //oh my  - that is a how
    for(String name: names) { //that is also a how
      //if(name == "Nemo") // that is also a how
      if(name.equals("Nemo")) {// that is also a how
        found = true;
	break; //that is also another how
      }
    }

    if(found) {
      System.out.println("Nemo found");
    } else {
      System.out.println("Nemo not found");
    }
  }
}
