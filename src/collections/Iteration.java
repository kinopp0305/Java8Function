package collections;

import java.util.List;
import java.util.Arrays;
import static collections._Folks.friends;
import java.util.function.Consumer;

/**
 * 色々なイテレーション（2.1 リストをイテレート）
 * @author kinopp
 */
public class Iteration {

    /**
     * メイン
     * @param args ダミー
     */
    public static void main(final String... args) {
        
        // 自殺点パターン（冗長でエラーが発生しやすい）
        System.out.println("//" + "START:自殺点パターン");
        for(int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }

        // 拡張for文 -> 外部イテレーター
        System.out.println("//" + "START:拡張for文");
        for(String name : friends) {
            System.out.println(name);
        }

        // 匿名インナークラスを使用
        // -- forEachはConsumer型を引数に取る
        System.out.println("//" + "START:匿名インナークラス");
        friends.forEach(
            new Consumer<String>() {
                public void accept(final String name) {
                    System.out.println(name);
                }
            }
        );
        // ラムダ式を使用（型あり）
        System.out.println("//" + "START:ラムダ式を使用（型あり）");
        friends.forEach((final String name) -> System.out.println(name));
        
        // ラムダ式を使用（型省略）
        System.out.println("//" + "START:ラムダ式を使用（型省略）");
        friends.forEach((name) -> System.out.println(name));

        // ラムダ式を使用（カッコも省略）
        System.out.println("//" + "START:ラムダ式を使用（カッコも省略）");
        friends.forEach(name -> System.out.println(name));
        
        // メソッド参照を使用
        System.out.println("//" + "START:メソッド参照を使用");
        friends.forEach(System.out::println);
    }
}
