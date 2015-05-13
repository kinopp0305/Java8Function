/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
 * 
 * 4.2 ラムダ式を使った委譲
 * 
 * 
***/
package designing;

import java.math.BigDecimal;
import java.util.function.Function;

/**
 *
 * @author kinoshita_h
 */
public class CalculateNAV {

    /**
     *
     * @param ticker
     * @param shares
     * @return
     */
    public BigDecimal computeStockWorth(final String ticker, final int shares) {
        return priceFinder.apply(ticker).multiply(BigDecimal.valueOf(shares));
    }
    //... other methods that use the priceFinder ...

    private Function<String, BigDecimal> priceFinder;

    /**
     *
     * @param aPriceFinder
     */
    public CalculateNAV(final Function<String, BigDecimal> aPriceFinder) {
        priceFinder = aPriceFinder;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        final CalculateNAV calculateNav = new CalculateNAV(_YahooFinance::getPrice);
    
        System.out.println(String.format("100 shares of Google worth: $%.2f",calculateNav.computeStockWorth("GOOG", 100)));
    }
}
