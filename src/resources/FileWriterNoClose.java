package resources;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kinopp
 */
public class FileWriterNoClose {
    private FileWriter writer;
  
    /**
     *
     * @param fileName
     * @throws IOException
     */
    public FileWriterNoClose(String fileName) throws IOException {
        writer = new FileWriter(fileName);
    }
  
    /**
     *
     * @param message
     * @throws IOException
     */
    public void writeStuff(String message) throws IOException {
        writer.write(message);
    }
  
    public void finalize() throws IOException {
        writer.close();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            FileWriterNoClose writerExample = new FileWriterNoClose("noclose.txt");
            writerExample.writeStuff("peek-a-boo");      
        } catch(IOException ex) {
            System.out.println(ex);
        }
    }
}
