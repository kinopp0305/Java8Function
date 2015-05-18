package compare;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

/**
 * 当ソースのプロジェクト配下にあるフォルダーのパスを表示（ファイルは対象外）
 * @author kinopp
 */
public class ListDirs {

    /**
     * メイン
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
      Files.list(Paths.get("."))
           .filter(Files::isDirectory)
           .forEach(System.out::println);
    }
}
