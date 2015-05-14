package applying;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author kinopp
 */
public class PickStockImperative {

    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
        final List<_StockInfo> stocks = new ArrayList<>();
        for(String symbol : _Tickers.symbols) {
            stocks.add(_StockUtil.getPrice(symbol));
        }
    
        final List<_StockInfo> stocksPricedUnder500 = new ArrayList<>();
        final Predicate<_StockInfo> isPriceLessThan500 = _StockUtil.isPriceLessThan(500);
        for(_StockInfo stock : stocks) {
            if(isPriceLessThan500.test(stock))
                stocksPricedUnder500.add(stock);
        }
    
        _StockInfo highPriced = new _StockInfo("", BigDecimal.ZERO);
        for(_StockInfo stock : stocksPricedUnder500) {
            highPriced = _StockUtil.pickHigh(highPriced, stock);
        }
    
        System.out.println("High priced under $500 is " + highPriced);
    }
}
