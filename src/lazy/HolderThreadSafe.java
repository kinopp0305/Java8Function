package lazy;

/**
 *
 * @author kinopp
 */
public class HolderThreadSafe {
    private _Heavy heavy;
  
    /**
     *
     */
    public HolderThreadSafe() {
        System.out.println("Holder created");
    }

    /**
     *
     * @return
     */
    public synchronized _Heavy getHeavy() {
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
        final HolderThreadSafe holder = new HolderThreadSafe();
        System.out.println("deferring heavy creation...");
        System.out.println(holder.getHeavy());
        System.out.println(holder.getHeavy());
    }
}
