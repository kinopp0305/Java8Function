package compare;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

/**
 *
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
