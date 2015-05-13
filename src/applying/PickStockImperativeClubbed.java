/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package applying;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author kinopp
 */
public class PickStockImperativeClubbed {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    _StockInfo highPriced = new _StockInfo("", BigDecimal.ZERO);
    final Predicate<_StockInfo> isPriceLessThan500 = _StockUtil.isPriceLessThan(500);

    for(String symbol : _Tickers.symbols) {
      _StockInfo stockInfo = _StockUtil.getPrice(symbol);
      
      if(isPriceLessThan500.test(stockInfo))
        highPriced = _StockUtil.pickHigh(highPriced, stockInfo);
    }
    System.out.println("High priced under $500 is " + highPriced);
  }
}
