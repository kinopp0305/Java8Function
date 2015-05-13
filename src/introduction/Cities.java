package introduction;

import java.util.List;
import java.util.Arrays;

/**
 * 「Chicago」があったらtrueを返す
 * @author kinoshita_h
 */
public class Cities {

    /**
     * 「Chicago」があったらtrueを返すメソッド
     *  -- ループで探す。あまりよくない例
     * @param cities
     */
    public static void findChicagoImperative(final List<String> cities) {
        boolean found = false;
        for(String city : cities) {
            if(city.equals("Chicago")) {
                found = true;
                break;
            }
        }
        System.out.println("Found chicago?:" + found);
    }

    /**
     * 「Chicago」があったらtrueを返すメソッド
     *  -- containを使用。直感的にわかる
     * @param cities
     */
    public static void findChicagoDeclarative(final List<String> cities) {
        System.out.println("Found chicago?:" + cities.contains("Chicago"));
    }

    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        List<String> cities = Arrays.asList("Albany", "Boulder", "Chicago", "Denver", "Eugene");
	
        findChicagoImperative(cities);    //trueを返す
        findChicagoDeclarative(cities);   //trueを返す
    }
}
