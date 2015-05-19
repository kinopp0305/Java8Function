package compare;

/**
 * 個人を表すクラス
 * @author kinopp
 */
public class _Person {
    private final String name;
    private final int age;
  
    /**
     * コンストラクタ
     * @param theName 名前
     * @param theAge 年齢
     */
    public _Person(final String theName, final int theAge) {
        name = theName;
        age = theAge;
    } 
  
    /**
     * 名前を取得
     * @return 名前
     */
    public String getName() { return name; }

    /**
     * 年齢を取得
     * @return 年齢
     */
    public int getAge() { return age; }
  
    /**
     * 年齢の差分を返却
     * @param other _Person
     * @return 差分 int
     */
    public int ageDifference(final _Person other) {
        return age - other.age;
    }
  
    /**
     * 年齢と名前を表示用にフォーマット
     * @return フォーマット後文字列 String
     */
    public String toString() {
        return String.format("%s - %d", name, age);
    }
}
