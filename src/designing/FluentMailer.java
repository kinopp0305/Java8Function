package designing;

import java.util.function.Consumer;

/**
 *
 * @author kinopp
 */
public class FluentMailer {
  private FluentMailer() {}
  
    /**
     *
     * @param address
     * @return
     */
    public FluentMailer from(final String address) { /*... */; return this; }

    /**
     *
     * @param address
     * @return
     */
    public FluentMailer to(final String address)   { /*... */; return this; }

    /**
     *
     * @param line
     * @return
     */
    public FluentMailer subject(final String line) { /*... */; return this; }

    /**
     *
     * @param message
     * @return
     */
    public FluentMailer body(final String message) { /*... */; return this; }
  
    /**
     *
     * @param block
     */
    public static void send(final Consumer<FluentMailer> block) { 
    final FluentMailer mailer = new FluentMailer();
    block.accept(mailer); 
    System.out.println("sending..."); 
  }

  //...

    /**
     *
     * @param args
     */
      public static void main(final String[] args) {
    FluentMailer.send(mailer ->
      mailer.from("build@agiledeveloper.com")
            .to("venkats@agiledeveloper.com")
            .subject("build notification")
            .body("...much better..."));
  }
}
