package designing;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import designing._Asset.AssetType;

/**
 * AssetUtilクラスのリファクタリング版（4.1.3 主要な関心を分離）
 * @author kinoshita_h
 */
public class AssetUtilRefactored {

    /**
     * AssetValuesの合計値を取得する
     * 
     * @param assets 合計する対象の<_Asset>クラス
     * @param assetSelector 合計する条件。Predicateインターフェイスを実装する関数
     * @return
     */
    public static int totalAssetValues(final List<_Asset> assets, final Predicate<_Asset> assetSelector) {
        return assets.stream()
                     .filter(assetSelector)
                     .mapToInt(_Asset::getValue)
                     .sum();
    }
  
    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        List<_Asset> assets = Arrays.asList(
            new _Asset(_Asset.AssetType.BOND, 1000),
            new _Asset(_Asset.AssetType.BOND, 2000),
            new _Asset(_Asset.AssetType.STOCK, 3000),
            new _Asset(_Asset.AssetType.STOCK, 4000)
        );

        // 全件対象。常にtrue
        System.out.println("Total of all assets: " + 
          totalAssetValues(assets, asset -> true));

        // AssetType.BONDが対象。
        System.out.println("Total of bonds: " + 
          totalAssetValues(assets, asset -> asset.getType() == AssetType.BOND));

        // AssetType.STOCKが対象。
        System.out.println("Total of stocks: " + 
          totalAssetValues(assets, asset -> asset.getType() == AssetType.STOCK));
    }
}
