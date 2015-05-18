package recur;

/**
 *
 * @author kinopp
 */
public class _TailCalls {

    /**
     *
     * @param <T>
     * @param nextCall
     * @return
     */
    public static <T> TailCall<T> call(final TailCall<T> nextCall) {
        return nextCall;
    }

    /**
     *
     * @param <T>
     * @param value
     * @return
     */
    public static <T> TailCall<T> done(final T value) {
        return new TailCall<T>() {      
            @Override public boolean isComplete() { return true; }
            @Override public T result() { return value; }
            @Override public TailCall<T> apply() { 
                throw new Error("not implemented"); 
            }
        };
    }  
}
