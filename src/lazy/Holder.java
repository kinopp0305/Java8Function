package lazy;

import java.util.function.Supplier;

/**
 *
 * @author kinopp
 */
public class Holder {
    private Supplier<_Heavy> heavy = () -> createAndCacheHeavy();
  
    /**
     *
     */
    public Holder() {
        System.out.println("Holder created");
    }

    /**
     *
     * @return
     */
    public _Heavy getHeavy() {
        return heavy.get();
    }
  //...

    private synchronized _Heavy createAndCacheHeavy() {
        class HeavyFactory implements Supplier<_Heavy> {
            private final _Heavy heavyInstance = new _Heavy();
            public _Heavy get() { return heavyInstance; }
        }

        if(!HeavyFactory.class.isInstance(heavy)) {
            heavy = new HeavyFactory();
        }
    
        return heavy.get();
    }

    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        final Holder holder = new Holder();
        System.out.println("deferring heavy creation...");
        System.out.println(holder.getHeavy());
        System.out.println(holder.getHeavy());
    }
}
