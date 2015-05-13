/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package lazy;

import java.util.stream.IntStream;

/**
 *
 * @author kinopp
 */
public class _PrimeFinder {

    /**
     *
     * @param number
     * @return
     */
    public static boolean isPrime(final int number) {
    return number > 1 && 
      IntStream.rangeClosed(2, (int) Math.sqrt(number))
               .noneMatch(divisor -> number % divisor == 0);
  }
}
