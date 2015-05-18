package designing;

import java.util.Arrays;
import java.util.List;
import designing._Asset.AssetType;

/**
 *
 * @author kinopp
 */
public class AssetUtil {

    /**
     *
     * @param assets
     * @return
     */
    public static int totalAssetValues(final List<_Asset> assets) {
        return assets.stream()
                 .mapToInt(_Asset::getValue)
                 .sum();
    }

    /**
     *
     * @param assets
     * @return
     */
    public static int totalBondValues(final List<_Asset> assets) {
        return assets.stream()
                 .mapToInt(asset -> 
                    asset.getType() == AssetType.BOND ? asset.getValue() : 0)
                 .sum();
    }

    /**
     *
     * @param assets
     * @return
     */
    public static int totalStockValues(final List<_Asset> assets) {
        return assets.stream()
                 .mapToInt(asset -> 
                    asset.getType() == AssetType.STOCK ? asset.getValue() : 0)
                 .sum();
    }

    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
        final List<_Asset> assets = Arrays.asList(
            new _Asset(_Asset.AssetType.BOND, 1000),
            new _Asset(_Asset.AssetType.BOND, 2000),
            new _Asset(_Asset.AssetType.STOCK, 3000),
            new _Asset(_Asset.AssetType.STOCK, 4000)
        );
    
        System.out.println("//" + "START:TOTAL_ALL_OUTPUT");
        System.out.println("Total of all assets: " + totalAssetValues(assets));
        System.out.println("//" + "END:TOTAL_ALL_OUTPUT");

        System.out.println("//" + "START:TOTAL_BONDS_OUTPUT");
        System.out.println("Total of bonds: " + totalBondValues(assets));
        System.out.println("//" + "END:TOTAL_BONDS_OUTPUT");

        System.out.println("//" + "START:TOTAL_STOCKS_OUTPUT");
        System.out.println("Total of stocks: " + totalStockValues(assets));      
        System.out.println("//" + "END:TOTAL_STOCKS_OUTPUT");
    }
}
