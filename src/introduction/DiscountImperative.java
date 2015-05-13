/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
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
