/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
 * 
 * 2.4 ラムダ式の再利用
 * 
***/
package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import static collections._Folks.friends;
import static collections._Folks.comrades;
import static collections._Folks.editors;

/**
 *
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
