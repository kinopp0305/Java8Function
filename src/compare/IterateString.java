package compare;

import java.util.StringJoiner;

/**
 * 文字列のイテレーション
 * @author kinopp
 */
public class IterateString {
    
    // 文字コードを文字に変換し出力する
    private static void printChar(int aChar) {
        System.out.println((char)(aChar));
    }
  
    /**
     * メイン
     * @param args
     */
    public static void main(String[] args) {

        final String str = "w00t";

        System.out.println("//" + "START:内部イテレーション（数字で出る！）");
        str.chars()
           .forEach(ch -> System.out.println(ch));

        System.out.println("//" + "START:メソッド参照（数字で出る！）");
        str.chars()
           .forEach(System.out::println);

        System.out.println("//" + "START:文字を表示するように修正１");
        str.chars()
           .forEach(IterateString::printChar);

        System.out.println("//" + "START:文字を表示するように修正２");
        str.chars()
           .mapToObj(ch -> Character.valueOf((char)ch))
           .forEach(System.out::println);

        System.out.println("//" + "START:数字だったら出力１");
        str.chars()
           .filter(ch -> Character.isDigit(ch))
           .forEach(ch -> printChar(ch));

        
//        str.chars()
//           .filter(ch -> Character.isDigit(ch));
//
//        str.chars()
//           .filter(Character::isDigit);
        
        System.out.println("//" + "START:数字だったら出力２");
        str.chars()
           .filter(Character::isDigit)
           .forEach(IterateString::printChar);

    }
}
