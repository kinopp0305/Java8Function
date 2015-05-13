/***
 * Excerpted from "Functional Programming in Java",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/vsjava8 for more book information.
***/
package lazy;

/**
 *
 * @author kinopp
 */
public class HolderNaive {
  private _Heavy heavy;
  
    /**
     *
     */
    public HolderNaive() {
    System.out.println("Holder created");
  }
  
    /**
     *
     * @return
     */
    public _Heavy getHeavy() {
    if(heavy == null) {
      heavy = new _Heavy();
    }
    
    return heavy;
  }

//...

    /**
     *
     * @param args
     */
    
  public static void main(final String[] args) {
    final HolderNaive holder = new HolderNaive();
    System.out.println("deferring heavy creation...");
    System.out.println(holder.getHeavy());
    System.out.println(holder.getHeavy());
  }
}
