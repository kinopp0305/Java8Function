package compare;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

/**
 *
 * @author kinopp
 */
public class ListSelectFiles {

    /**
     * メイン
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        {
            final String[] files = 
                new File("compare").list(
                    new java.io.FilenameFilter() {
                        public boolean accept(final File dir, final String name) {
                            return name.endsWith(".java");
                        }
                    }
                );
  /*
  System.out.println(files);
  */
        }

        Files.newDirectoryStream(
             Paths.get("compare"), path -> path.toString().endsWith(".java")
        ).forEach(System.out::println);
    }
}
