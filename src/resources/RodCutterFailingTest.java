package resources;

import junit.framework.JUnit4TestAdapter;

/**
 *
 * @author kinopp
 */
public class RodCutterFailingTest extends RodCutterTest {

    /**
     *
     * @return
     */
    protected _RodCutter createCutter() {
        return new _RodCutter(true);
    }
  
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        junit.textui.TestRunner.run(
        new JUnit4TestAdapter(RodCutterFailingTest.class));
    }
}
