package recur;

import java.util.List;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import static recur._Memoizer.callMemoized;

/**
 *
 * @author kinopp
 */
public class RodCutterMemoized extends RodCutterBasic {

    /**
     *
     * @param pricesForLength
     */
    public RodCutterMemoized(final List<Integer> pricesForLength) {
        super(pricesForLength);
    }

    /**
     *
     * @param rodLength
     * @return
     */
    public int maxProfit(final int rodLength) {
        BiFunction<Function<Integer, Integer>, Integer, Integer> compute =
            (func, length) -> {
                int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
                for(int i = 1; i < length; i++) {
                    int priceWhenCut = func.apply(i) + func.apply(length - i);
                    if(profit < priceWhenCut) profit = priceWhenCut;
                }
                return profit;
            };
        return callMemoized(compute, rodLength);
    }
  
    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
        final RodCutterMemoized rodCutterMomoized
            = new RodCutterMemoized(RodCutterBasic.priceValues);
    //run(foo);
    
        System.out.println(rodCutterMomoized.maxProfit(5));    
        System.out.println(rodCutterMomoized.maxProfit(22));    
    }
}
