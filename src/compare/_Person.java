/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package compare;

/**
 *
 * @author kinopp
 */
public class _Person {
  private final String name;
  private final int age;
  
    /**
     *
     * @param theName
     * @param theAge
     */
    public _Person(final String theName, final int theAge) {
    name = theName;
    age = theAge;
  } 
  
    /**
     *
     * @return
     */
    public String getName() { return name; }

    /**
     *
     * @return
     */
    public int getAge() { return age; }
  
    /**
     *
     * @param other
     * @return
     */
    public int ageDifference(final _Person other) {
    return age - other.age;
  }
  
  public String toString() {
    return String.format("%s - %d", name, age);
  }
}
