/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package applying;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 *
 * @author kinoshita_h
 */
public class PickStockFunctional {

    /**
     *
     * @param symbols
     */
    public static void findHighPriced(final Stream<String> symbols) {
        final _StockInfo highPriced = 
            symbols.map(_StockUtil::getPrice)
                   .filter(_StockUtil.isPriceLessThan(500))
                   .reduce(_StockUtil::pickHigh)
                   .get();    
        
        System.out.println("High priced under $500 is " + highPriced);
    }

    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
        findHighPriced(_Tickers.symbols.stream());
    }
}
