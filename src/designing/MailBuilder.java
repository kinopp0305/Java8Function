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
