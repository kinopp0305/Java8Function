package compare;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

/**
 * 当ソースのプロジェクト配下にあるファイルまたはフォルダーのパスを表示
 * @author kinopp
 */
public class ListFiles {

    /**
     * メイン
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Files.list(Paths.get("."))
             .forEach(System.out::println);
    }
}
