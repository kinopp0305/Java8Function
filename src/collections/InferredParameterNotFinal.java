/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
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
