/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
 * 
 * 2.2 リストの変換
 * 
***/
package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import static collections._Folks.friends;

/**
 *
 * @author kinopp
 */
public class Transform {

    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
        
        System.out.println("//" + "START:拡張for文で実行（リストを表示）");
        {
            final List<String> uppercaseNames = new ArrayList<String>();
    
            for(String name : friends) {
                uppercaseNames.add(name.toUpperCase());
            }

            System.out.println(uppercaseNames);
        }
        
        System.out.println("//" + "START:ラムダ式で実行（リストを表示）");
        {
            final List<String> uppercaseNames = new ArrayList<String>();
            friends.forEach(name -> uppercaseNames.add(name.toUpperCase()));
            System.out.println(uppercaseNames);
        }

        /*
        friends.stream()
             .map(name -> name.toUpperCase());
        */

        System.out.println("//" + "START:ラムダ式で実行（要素を表示）");
        friends.stream()
               .map(name -> name.toUpperCase())
               .forEach(name -> System.out.print(name + " "));     
        System.out.println();

        System.out.println("//" + "START:ラムダ式で実行（要素の文字数を表示）");
        friends.stream()
               .map(name -> name.length())
               .forEach(count -> System.out.print(count + " "));

        System.out.println();

        /*
        friends.stream()
           .map(String::toUpperCase);
        */

        System.out.println("//" + "START:メソッド参照で実行（要素を表示）");
        friends.stream()
               .map(String::toUpperCase)
               .forEach(name -> System.out.println(name));
        
        System.out.println("//" + "START:全てメソッド参照で実行（要素を表示）");
        friends.stream()
               .map(String::toUpperCase)
               .forEach(System.out::println);
    }
}
