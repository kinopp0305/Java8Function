package resources;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.AutoCloseable;

/**
 *
 * @author kinopp
 */
public class FileWriterARM implements AutoCloseable {
    private final FileWriter writer;
  
    /**
     *
     * @param fileName
     * @throws IOException
     */
    public FileWriterARM(final String fileName) throws IOException {
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

    public void close() throws IOException {
        System.out.println("close called automatically...");
        writer.close();
    }

  //...

    /**
     *
     * @param args
     * @throws IOException
     */
    
    public static void main(final String[] args) throws IOException {
        try(final FileWriterARM writerARM = new FileWriterARM("peekaboo.txt")) {
            writerARM.writeStuff("peek-a-boo");
	  
            System.out.println("done with the resource...");
        }
    }

}
