package collections;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import static collections._Folks.friends;

/**
 *
 * @author kinopp
 */
public class PickALongest {

    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        {
            System.out.println("//" + "START:friendsリストの氏名の合計文字数");
            System.out.println("Total number of characters in all names: " +
            friends.stream()
                .mapToInt(name -> name.length())
                .sum());
        }

        System.out.println("//" + "START:reduceを使い一番長い文字を見つける");
        final Optional<String> aLongName = 
            friends.stream()
                .reduce((name1, name2) -> 
                    name1.length() >= name2.length() ? name1 : name2);
        aLongName.ifPresent(name ->
            System.out.println(String.format("A longest name: %s", name)));

        System.out.println("//" + "START:reduceを使い一番長い文字を見つける（初期値あり→Optionalを返さない）");
        final String steveOrLonger = 
            friends.stream()
                .reduce("Steve", (name1, name2) -> 
                    name1.length() >= name2.length() ? name1 : name2);
        System.out.println(steveOrLonger);
    }
}
