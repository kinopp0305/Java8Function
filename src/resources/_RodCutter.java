package resources;

import java.util.List;

/**
 *
 * @author kinopp
 */
public class _RodCutter {
    private boolean mustFail;
  
    /**
     *
     * @param fail
     */
    public _RodCutter(final boolean fail) { mustFail = fail; }

    /**
     *
     * @param prices
     */
    public void setPrices(final List<Integer> prices) {
    //...
        if(mustFail) 
            throw new _RodCutterException();
    }

    /**
     *
     * @param length
     * @return
     */
    public int maxProfit(final int length) {
        if (length == 0) throw new _RodCutterException();
        return 0;
    }
}
