package applying;

import designing._YahooFinance;
import java.math.BigDecimal;
import static java.util.stream.Collectors.joining;

/**
 *
 * @author kinoshita_h
 */
public class Stocks100 {

    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        final BigDecimal HUNDRED = new BigDecimal("100");
        System.out.println("Stocks priced over $100 are " + 
            _Tickers.symbols
                .stream()
                .filter(symbol -> _YahooFinance.getPrice(symbol).compareTo(HUNDRED) > 0)
                .sorted()
                .collect(joining(", ")));
    }
}
