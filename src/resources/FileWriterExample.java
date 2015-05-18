package resources;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author kinopp
 */
public class FileWriterExample {
    private final FileWriter writer;
  
    /**
     *
     * @param fileName
     * @throws IOException
     */
    public FileWriterExample(final String fileName) throws IOException {
        writer = new FileWriter(fileName);
    }

    /**
     *
     * @param message
     * @throws IOException
     */
    public void writeStuff(final String message) throws IOException {
        writer.write(message);
    }
    public void finalize() throws IOException {
        writer.close();
    }
  //...

    /**
     *
     * @throws IOException
     */
    public void close() throws IOException {
        writer.close();
    }

/*
  public static void main(final String[] args) throws IOException {
    final FileWriterExample writerExample = 
      new FileWriterExample("peekaboo.txt");
    writerExample.writeStuff("peek-a-boo");      
  }
*/

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void callClose(final String[] args) throws IOException {
        final FileWriterExample writerExample = new FileWriterExample("peekaboo.txt");
      
        writerExample.writeStuff("peek-a-boo");      
        writerExample.close();
    }

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(final String[] args) throws IOException {
        final FileWriterExample writerExample = new FileWriterExample("peekaboo.txt");
        try {
            writerExample.writeStuff("peek-a-boo");            
        } finally {
            writerExample.close();      
        }
    }

}
