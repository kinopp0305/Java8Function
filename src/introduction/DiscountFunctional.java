package introduction;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import static introduction._ValuePrices.prices;

/**
 * streamを使用して合計を求める。内部イテレーションの例
 * @author kinoshita_h
 */
public class DiscountFunctional {

    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        
        final BigDecimal totalOfDiscountedPrices = 
            prices.stream()
                .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)  // 20より大きいものを抽出
                .map(price -> price.multiply(BigDecimal.valueOf(0.9)))         // 0.9かけたものをmap
                .reduce(BigDecimal.ZERO, BigDecimal::add);                     // 加算する

        System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
    }
}
