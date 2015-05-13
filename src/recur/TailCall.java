/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package recur;

import java.util.stream.Stream;

/**
 *
 * @author kinopp
 * @param <T>
 */
@FunctionalInterface
public interface TailCall<T> {
  
    /**
     *
     * @return
     */
    TailCall<T> apply();
  
    /**
     *
     * @return
     */
    default boolean isComplete() { return false; }
  //...

    /**
     *
     * @return
     */
    default T result() { throw new Error("not implemented"); }
  
    /**
     *
     * @return
     */
    default T invoke() {
    return Stream.iterate(this, TailCall::apply)
                 .filter(TailCall::isComplete)
                 .findFirst()
                 .get()
                 .result();
  }
}
