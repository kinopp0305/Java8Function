/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package introduction;

/**
 * 関数インタフェースの例
 * @author kinoshita_h
 */
public class MarkingAsFunctionalIsOptional {

    /**
     * アノテーションなし
     */
    public interface Sample1 {

        /**
         *
         * @param input
         * @return
         */
        boolean test(int input);
    }

    /**
     * アノテーションあり
     */
    @FunctionalInterface
    public interface Sample2 {

        /**
         *
         * @param input
         * @return
         */
        boolean test(int input);
    }
    
    /**
     * 引数なし
     */
    @FunctionalInterface
    public interface Sample3 {

        /**
         *
         * @param なし
         * @return
         */
        boolean test();
    }
  
    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        Sample1 sample1 = input -> true;  // @FunctionalInterfaceなし
        Sample2 sample2 = input -> true;  // @FunctionalInterfaceあり
        Sample3 sample3 = () -> true;     // 引数なし
    
        System.out.println(sample1.test(4));
        System.out.println(sample2.test(4));
        System.out.println(sample3.test());
    }
}
