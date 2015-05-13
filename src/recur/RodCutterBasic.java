/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package recur;

import java.util.List;
import java.util.Arrays;
import java.util.function.Function;
import static recur._Memoizer.callMemoized;

/**
 *
 * @author kinopp
 */
public class RodCutterBasic {
  final List<Integer> prices;

    /**
     *
     * @param pricesForLength
     */
    public RodCutterBasic(final List<Integer> pricesForLength) {
    prices = pricesForLength;
  }
  
  //...
  
    /**
     *
     * @param length
     * @return
     */
      
  public int maxProfit(final int length) {
    int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
    for(int i = 1; i < length; i++) {
      int priceWhenCut = maxProfit(i) + maxProfit(length - i);
      if(profit < priceWhenCut) profit = priceWhenCut;
    }
    
    return profit;
  }

    static
    final List<Integer> priceValues = 
      Arrays.asList(2, 1, 1, 2, 2, 2, 1, 8, 9, 15);
      
    /**
     *
     * @param rodCutter
     */
    public static void run(final RodCutterBasic rodCutter) {

    System.out.println(rodCutter.maxProfit(5));
    System.out.println(rodCutter.maxProfit(22));
  }
  
    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
    final RodCutterBasic rodCutter = new RodCutterBasic(priceValues);
    run(rodCutter);
  }
}
