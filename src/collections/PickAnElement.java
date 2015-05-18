package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import static collections._Folks.friends;

/**
 * 名前を見つける（関数未使用）
 * @author kinopp
 */
public class PickAnElement {

    /**
     * 検索文字で始まる最初の名前をリストより検索する
     * @param names 検索対象の名前リスト
     * @param startingLetter 検索文字
     */
    public static void pickName(final List<String> names, final String startingLetter) {
        String foundName = null;
        for(String name : names) {
            if(name.startsWith(startingLetter)) {
                foundName = name;
                break;
            }
        }
        System.out.print(String.format("A name starting with %s: ", startingLetter));
      
        if(foundName != null) {
            System.out.println(foundName);
        } else {
            System.out.println("No name found");
        }
    }

    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        pickName(friends, "N");
        pickName(friends, "Z");
    }
}
