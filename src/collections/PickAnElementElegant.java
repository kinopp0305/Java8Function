package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import static collections._Folks.friends;

/**
 * 検索文字で始まる最初の名前をリストより検索する（関数未使用）
 * @author kinopp
 */
public class PickAnElementElegant {

    /**
     * 検索文字で始まる最初の名前をリストより検索する
     * @param names 検索対象の名前リスト
     * @param startingLetter 検索文字
     */
    public static void pickName(final List<String> names, final String startingLetter) {
        // Optinalクラスを使用。結果が存在しないことを明示する場合に便利。
        final Optional<String> foundName = 
            names.stream()
               .filter(name ->name.startsWith(startingLetter))
               .findFirst();
      
        System.out.println(String.format("A name starting with %s: %s",
            startingLetter, foundName.orElse("No name found")));
    }

    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println("//" + "START:pickNameメソッド実行");
        pickName(friends, "N");
        pickName(friends, "Z");

        System.out.println("//" + "START:Optionalクラス使用");
        final Optional<String> foundName = 
            friends.stream()
                .filter(name ->name.startsWith("N"))
                .findFirst();

        foundName.ifPresent(name -> System.out.println("Hello " + name));
    }
}
