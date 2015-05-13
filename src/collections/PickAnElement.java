package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import static collections._Folks.friends;

/**
 *
 * @author kinopp
 */
public class PickAnElement {

    /**
     *
     * @param names
     * @param startingLetter
     */
    public static void pickName(
    final List<String> names, final String startingLetter) {
    String foundName = null;
    for(String name : names) {
      if(name.startsWith(startingLetter)) {
        foundName = name;
        break;
      }
    }
    System.out.print(String.format("A name starting with %s: ", startingLetter));
      
    if(foundName != null) {
      System.out.println(foundName);
    } else {
      System.out.println("No name found");
    }
  }

    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
    pickName(friends, "N");
    pickName(friends, "Z");
  }
}
