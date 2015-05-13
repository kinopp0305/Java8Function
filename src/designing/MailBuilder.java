/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package designing;

/**
 *
 * @author kinopp
 */
public class MailBuilder {

    /**
     *
     * @param address
     * @return
     */
    public MailBuilder from(final String address) { /*... */; return this; }

    /**
     *
     * @param address
     * @return
     */
    public MailBuilder to(final String address)   { /*... */; return this; }

    /**
     *
     * @param line
     * @return
     */
    public MailBuilder subject(final String line) { /*... */; return this; }

    /**
     *
     * @param message
     * @return
     */
    public MailBuilder body(final String message) { /*... */; return this; }

    /**
     *
     */
    public void send() { System.out.println("sending..."); }

  //...

    /**
     *
     * @param args
     */
      public static void main(final String[] args) {
    new MailBuilder()
      .from("build@agiledeveloper.com")
      .to("venkats@agiledeveloper.com")
      .subject("build notification")
      .body("...it sucks less...")
      .send();
  }
}
