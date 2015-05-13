package collections;

import java.util.List;
import java.util.Arrays;
import static collections._Folks.friends;

/**
 *
 * @author kinopp
 */
public class InferredParameterNotFinal {

    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
        friends.forEach(
            name -> {
                name = name.toUpperCase();
                System.out.println(name);
            }
        );
    }
}
