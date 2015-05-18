package designing;

import java.math.BigDecimal;
import java.util.function.Function;

/**
 * 4.2 ラムダ式を使った委譲
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
