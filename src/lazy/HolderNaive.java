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
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        final HolderNaive holder = new HolderNaive();
        System.out.println("deferring heavy creation...");
        System.out.println(holder.getHeavy());
        System.out.println(holder.getHeavy());
    }
}
