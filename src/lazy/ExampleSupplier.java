/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package lazy;

import java.util.function.Supplier;

/**
 *
 * @author kinopp
 */
public class ExampleSupplier {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    {
    Supplier<_Heavy> supplier = () -> new _Heavy();
      System.out.println(supplier.get());
    }

    {
    Supplier<_Heavy> supplier = _Heavy::new;
      System.out.println(supplier.get());
    }

  }
}
