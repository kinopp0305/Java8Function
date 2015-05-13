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
public class Holder {
  private Supplier<_Heavy> heavy = () -> createAndCacheHeavy();
  
    /**
     *
     */
    public Holder() {
    System.out.println("Holder created");
  }

    /**
     *
     * @return
     */
    public _Heavy getHeavy() {
    return heavy.get();
  }
  //...

  private synchronized _Heavy createAndCacheHeavy() {
    class HeavyFactory implements Supplier<_Heavy> {
      private final _Heavy heavyInstance = new _Heavy();

      public _Heavy get() { return heavyInstance; }
    }

    if(!HeavyFactory.class.isInstance(heavy)) {
      heavy = new HeavyFactory();
    }
    
    return heavy.get();
  }

    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
    final Holder holder = new Holder();
    System.out.println("deferring heavy creation...");
    System.out.println(holder.getHeavy());
    System.out.println(holder.getHeavy());
  }
}
