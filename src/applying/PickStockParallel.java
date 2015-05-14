package applying;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author kinoshita_h
 */
public class PickStockParallel extends PickStockFunctional {

    /**
     * メイン
     * @param args
     */
    public static void main(String[] args) {
        findHighPriced(_Tickers.symbols.parallelStream());
    }
}
