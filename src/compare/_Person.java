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
