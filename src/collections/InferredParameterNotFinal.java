package collections;

import java.util.List;
import java.util.Arrays;
import static collections._Folks.friends;

/**
 * 大文字に変換しfriendsリストを表示
 * @author kinopp
 */
public class InferredParameterNotFinal {

    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        friends.forEach(
            name -> {
                name = name.toUpperCase();
                System.out.println(name);
            }
        );
    }
}
