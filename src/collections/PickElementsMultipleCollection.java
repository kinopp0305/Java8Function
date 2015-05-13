package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import static collections._Folks.friends;
import static collections._Folks.comrades;
import static collections._Folks.editors;

/**
 * 2.4 ラムダ式の再利用
 * @author kinopp
 */
public class PickElementsMultipleCollection {
    
    /**
     *
     * @param args
     */
    public static void main(final String[] args) {

        // ラムダ式再利用なし
        System.out.println("//" + "START:ラムダ式再利用なし");
        {
            final long countFriendsStartN = 
            friends.stream()
                .filter(name -> name.startsWith("N")).count();

            final long countEditorsStartN = 
            editors.stream()
                .filter(name -> name.startsWith("N")).count();

            final long countComradesStartN = 
            comrades.stream()
                .filter(name -> name.startsWith("N")).count();

            System.out.println(countFriendsStartN);
            System.out.println(countComradesStartN);
            System.out.println(countEditorsStartN);
        }
        
        // ラムダ式再利用あり
        System.out.println("//" + "START:ラムダ式再利用あり");
        {
            // ラムダ式を共通化：Predicateを使用
            final Predicate<String> startsWithN = name -> name.startsWith("N");

            final long countFriendsStartN = 
                friends.stream()
                    .filter(startsWithN)
                    .count();
            final long countEditorsStartN = 
                editors.stream()
                    .filter(startsWithN)
                    .count();
            final long countComradesStartN = 
                comrades.stream()
                    .filter(startsWithN)
                    .count();

            System.out.println(countFriendsStartN);
            System.out.println(countComradesStartN);
            System.out.println(countEditorsStartN);
        }
    }
}
