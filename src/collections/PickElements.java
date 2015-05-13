/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
 * 
 * 2.3 要素の検索
 * 
***/
package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import static collections._Folks.friends;

/**
 *
 * @author kinopp
 */
public class PickElements {

    /**
     * collections._Folks.friendsからNで始まる名前の数を探す
     * @param args
     */
    public static void main(final String[] args) {
        // 拡張for文を使用
        System.out.println("//" + "START:拡張for文を使用");
        {
            final List<String> startsWithN = new ArrayList<String>();
            for(String name : friends) {
                if(name.startsWith("N")) {
                    startsWithN.add(name);
                }
            }
            System.out.println(String.format("Found %d names", startsWithN.size()));
        }

        System.out.println("//" + "START:ラムダ式を使用");
        final List<String> startsWithN =
            friends.stream()
                 .filter(name -> name.startsWith("N"))
                 .collect(Collectors.toList());
        System.out.println(String.format("Found %d names", startsWithN.size()));

    }
}
