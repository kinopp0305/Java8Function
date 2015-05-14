package applying;

import java.math.BigDecimal;

/**
 *
 * @author kinoshita_h
 */
public class _StockInfo {

    /**
     *
     */
    public final String ticker;

    /**
     *
     */
    public final BigDecimal price;

    /**
     *
     * @param symbol
     * @param thePrice
     */
    public _StockInfo(final String symbol, final BigDecimal thePrice) {
        ticker = symbol;
        price = thePrice;
    }

    public String toString() {
        return String.format("ticker: %s price: %g", ticker, price);
    }
}
