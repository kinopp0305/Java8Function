package compare;

import java.io.File;
import java.util.Arrays;

/**
 * 当ソースのプロジェクト配下にある隠しファイルまたはフォルダーのパスを表示
 * @author kinopp
 */
public class ListHiddenFiles {

    /**
     * メイン
     * @param args
     */
    public static void main(String[] args) {

        final File[] files = new File(".").listFiles(file -> file.isHidden());
        new File(".").listFiles(File::isHidden);
        Arrays.stream(files).forEach(System.out::println);
    }
}
