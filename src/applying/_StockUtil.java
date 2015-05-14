package applying;

import designing._YahooFinance;
import java.math.BigDecimal;
import java.util.function.Predicate;

/**
 *
 * @author kinoshita_h
 */
public class _StockUtil {

    /**
     *
     * @param ticker
     * @return
     */
    public static _StockInfo getPrice(final String ticker) {
        return new _StockInfo(ticker, _YahooFinance.getPrice(ticker));
    }
    //...

    /**
     *
     * @param price
     * @return
     */
    public static Predicate<_StockInfo> isPriceLessThan(final int price) {
        return stockInfo -> stockInfo.price.compareTo(BigDecimal.valueOf(price)) < 0;
    }

    /**
     *
     * @param stock1
     * @param stock2
     * @return
     */
    public static _StockInfo pickHigh(final _StockInfo stock1, final _StockInfo stock2) {      
        return stock1.price.compareTo(stock2.price) > 0 ? stock1 : stock2;
    }

}
