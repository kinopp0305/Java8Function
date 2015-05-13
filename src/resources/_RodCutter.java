/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package resources;

import java.util.List;

/**
 *
 * @author kinopp
 */
public class _RodCutter {
  private boolean mustFail;
  
    /**
     *
     * @param fail
     */
    public _RodCutter(final boolean fail) { mustFail = fail; }

    /**
     *
     * @param prices
     */
    public void setPrices(final List<Integer> prices) {
    //...
    if(mustFail) 
      throw new _RodCutterException();
  }

    /**
     *
     * @param length
     * @return
     */
    public int maxProfit(final int length) {
    if (length == 0) throw new _RodCutterException();
    
    return 0;
  }
}
