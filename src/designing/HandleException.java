package designing;

import java.util.List;
import java.util.stream.Stream;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author kinopp
 */
public class HandleException {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
    Stream.of("/usr", "/tmp")
          .map(path -> {
            try {
             return new File(path).getCanonicalPath();             
            } catch(IOException ex) {
             return ex.getMessage();
            }
           }) 
          .forEach(System.out::println);    
  }
}
