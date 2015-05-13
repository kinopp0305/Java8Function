/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
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
    final FileWriterExample writerExample = 
      new FileWriterExample("peekaboo.txt");
      
    writerExample.writeStuff("peek-a-boo");      
    writerExample.close();
}

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(final String[] args) throws IOException {
    final FileWriterExample writerExample = 
      new FileWriterExample("peekaboo.txt");
    try {
      writerExample.writeStuff("peek-a-boo");            
    } finally {
      writerExample.close();      
    }
  }

}
