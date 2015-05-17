package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.stream.Collectors.joining;
import java.util.StringJoiner;
import static collections._Folks.friends;

/**
 * 要素の結合
 * @author kinopp
 */
public class PrintList {

    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println("//" + "START:forによる繰り返しでカンマ出力");
        for(String name : friends) {
            System.out.print(name + ", ");
        }
        System.out.println();

        System.out.println("//" + "START:最後のカンマを出力しないようにする");
        for(int i = 0; i < friends.size() - 1; i++) {
            System.out.print(friends.get(i) + ", ");
        }
        if(friends.size() > 0) 
            System.out.println(friends.get(friends.size() - 1));

        System.out.println("//" + "START:String.joinによるカンマ付与");
        System.out.println(String.join(", ", friends));

        System.out.println("//" + "START:大文字に変換しカンマ付与（Collectors.joining使用）");
        System.out.println(
            friends.stream()
                 .map(String::toUpperCase)
                 .collect(joining(", ")));

    }
}
