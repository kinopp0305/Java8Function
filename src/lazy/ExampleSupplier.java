package lazy;

import java.util.function.Supplier;

/**
 *
 * @author kinopp
 */
public class ExampleSupplier {

    /**
     * メイン
     * @param args
     */
    public static void main(String[] args) {
        {
            Supplier<_Heavy> supplier = () -> new _Heavy();
            System.out.println(supplier.get());
        }

        {
            Supplier<_Heavy> supplier = _Heavy::new;
            System.out.println(supplier.get());
        }

    }
}
