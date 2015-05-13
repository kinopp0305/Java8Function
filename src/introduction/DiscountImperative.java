package introduction;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import static introduction._ValuePrices.prices;

/**
 * 関数型ではない例。拡張for文でループ
 * あまりよくない例
 * @author kinoshita_h
 */
public class DiscountImperative {

    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        BigDecimal totalOfDiscountedPrices = BigDecimal.ZERO;

        // ループを使用して合計を求める。内部イテレーションの例
        for(BigDecimal price : prices) {
            if(price.compareTo(BigDecimal.valueOf(20)) > 0) // 20より大きい場合
                totalOfDiscountedPrices = 
                  totalOfDiscountedPrices.add(price.multiply(BigDecimal.valueOf(0.9))); // 0.9かけたものを加算していく
        }
        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }
}
