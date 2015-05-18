package resources;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.AutoCloseable;

/**
 *
 * @author kinopp
 */
public class FileWriterEAM  {
    private final FileWriter writer;
  
    private FileWriterEAM(final String fileName) throws IOException {
        writer = new FileWriter(fileName);
    }
    private void close() throws IOException {
        System.out.println("close called automatically...");
        writer.close();
    }

    /**
     *
     * @param message
     * @throws IOException
     */
    public void writeStuff(final String message) throws IOException {
        writer.write(message);
    }
  //...

    /**
     *
     * @param fileName
     * @param block
     * @throws IOException
     */
    public static void use(final String fileName, 
      final UseInstance<FileWriterEAM, IOException> block) throws IOException {
    
        final FileWriterEAM writerEAM = new FileWriterEAM(fileName);    
        try {
            block.accept(writerEAM);
        } finally {
            writerEAM.close();
        }
    }

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(final String[] args) throws IOException {
  
        System.out.println("//" + "START:EAM_USE_OUTPUT");
        FileWriterEAM.use("eam.txt", writerEAM -> writerEAM.writeStuff("sweet"));
        System.out.println("//" + "END:EAM_USE_OUTPUT");

        FileWriterEAM.use("eam2.txt", writerEAM -> {
            writerEAM.writeStuff("how");
            writerEAM.writeStuff("sweet");      
        });
    }
}
