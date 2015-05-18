package designing;

/**
 *
 * @author kinopp
 */
public class Mailer {

    /**
     *
     * @param address
     */
    public void from(final String address) { /*... */ }

    /**
     *
     * @param address
     */
    public void to(final String address)   { /*... */ }

    /**
     *
     * @param line
     */
    public void subject(final String line) { /*... */ }

    /**
     *
     * @param message
     */
    public void body(final String message) { /*... */ }

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
    Mailer mailer = new Mailer();
    mailer.from("build@agiledeveloper.com");
    mailer.to("venkats@agiledeveloper.com");
    mailer.subject("build notification");
    mailer.body("...your code sucks...");
    mailer.send();
  }
}
