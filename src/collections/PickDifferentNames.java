package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.Function;
import static collections._Folks.friends;

/**
 * collections._Folks.friendsからNまたはBで始まる文字数を探す（2.5 静的スコープとクロージャ）
 * @author kinopp
 */
public class PickDifferentNames {

    /**
     * 始まる文字をパラメータに取りラムダ式を返すstatic関数
     * @param letter 文字
     * @return ラムダ式
     */
    public static Predicate<String> checkIfStartsWith(final String letter) {
        // startsWithはboolean型を返す
        return name -> name.startsWith(letter);
    }
  
    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {

        System.out.println("//" + "START:ラムダ式における重複");
        {
            // ラムダ式における重複
            // -- 重複があって無駄が多い
            final Predicate<String> startsWithN = name -> name.startsWith("N");
            final Predicate<String> startsWithB = name -> name.startsWith("B");
    
            final long countFriendsStartN = 
                friends.stream()
                    .filter(startsWithN).count();         
            final long countFriendsStartB = 
                friends.stream()
                    .filter(startsWithB).count();

            System.out.println(countFriendsStartN);
            System.out.println(countFriendsStartB);
        }

        System.out.println("//" + "START:静的スコープで重複排除");
        {   
            final long countFriendsStartN =
                friends.stream()
                    .filter(checkIfStartsWith("N")).count();
            final long countFriendsStartB =
                friends.stream()
                    .filter(checkIfStartsWith("B")).count();

            System.out.println(countFriendsStartN);
            System.out.println(countFriendsStartB);
        }

        System.out.println("//" + "START:スコープを限定するようにリファクタリング１");
        {
            // staticメソッドを使用しないようにスコープを限定
            final Function<String, Predicate<String>> startsWithLetter = 
                (String letter) -> {
                    Predicate<String> checkStarts = (String name) -> name.startsWith(letter);
                    return checkStarts;
                };

            final long countFriendsStartN =
                friends.stream()
                    .filter(startsWithLetter.apply("N")).count();
       
            final long countFriendsStartB =
                friends.stream()
                    .filter(startsWithLetter.apply("B")).count();

            System.out.println(countFriendsStartN);
            System.out.println(countFriendsStartB);
        }

        System.out.println("//" + "START:スコープを限定するようにリファクタリング２");
        {
            // 上記をより簡潔に記載
            final Function<String, Predicate<String>> startsWithLetter = 
                (String letter) -> (String name) -> name.startsWith(letter);

            final long countFriendsStartN =
                friends.stream()
                    .filter(startsWithLetter.apply("N")).count();
       
            final long countFriendsStartB =
                friends.stream()
                    .filter(startsWithLetter.apply("B")).count();

            System.out.println(countFriendsStartN);
            System.out.println(countFriendsStartB);
        }

        System.out.println("//" + "START:スコープを限定するようにリファクタリング３");
        {
            // 上記をさらに簡潔に記載
            final Function<String, Predicate<String>> startsWithLetter = 
                letter -> name -> name.startsWith(letter);

            final long countFriendsStartN =
                friends.stream()
                    .filter(startsWithLetter.apply("N")).count();
            final long countFriendsStartB =
                friends.stream()
                    .filter(startsWithLetter.apply("B")).count();

            System.out.println(countFriendsStartN);
            System.out.println(countFriendsStartB);
        }
    }
}
