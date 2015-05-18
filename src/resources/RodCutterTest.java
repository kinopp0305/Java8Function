package resources;

import org.junit.Before;
import org.junit.Test;
import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.List;
import static resources._TestHelper.assertThrows;

/**
 *
 * @author kinopp
 */
public class RodCutterTest {
    private _RodCutter rodCutter;
    private List<Integer> prices;
  
    /**
     *
     * @return
     */
    protected _RodCutter createCutter() {
        return new _RodCutter(false);
    }
  
    /**
     *
     */
    @Before public void initialize() {
        rodCutter = createCutter();
        prices = Arrays.asList(1, 1, 2, 2, 3, 4, 5);
    }

    /**
     *
     */
    @Test public void VerboseExceptionTest() {
        rodCutter.setPrices(prices);
        try {
            rodCutter.maxProfit(0);
            fail("Expected exception for zero length");
        } catch(_RodCutterException ex) {
            assertTrue("expected", true);
        }
    }

    /**
     *
     */
    @Test(expected = _RodCutterException.class) 
    public void TerseExceptionTest() {
        rodCutter.setPrices(prices);
        rodCutter.maxProfit(0);
    }

    /**
     *
     */
    @Test 
    public void ConciseExceptionTest() {
        rodCutter.setPrices(prices);
        assertThrows(_RodCutterException.class, () -> rodCutter.maxProfit(0));
    }
  
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        junit.textui.TestRunner.run(new JUnit4TestAdapter(RodCutterTest.class));
    }
}
