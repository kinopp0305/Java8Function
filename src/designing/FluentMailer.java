/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
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
