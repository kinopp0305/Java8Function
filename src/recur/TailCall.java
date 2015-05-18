package recur;

import java.util.stream.Stream;

/**
 *
 * @author kinopp
 * @param <T>
 */
@FunctionalInterface
public interface TailCall<T> {
  
    /**
     *
     * @return
     */
    TailCall<T> apply();
  
    /**
     *
     * @return
     */
    default boolean isComplete() { return false; }
  //...

    /**
     *
     * @return
     */
    default T result() { throw new Error("not implemented"); }
  
    /**
     *
     * @return
     */
    default T invoke() {
        return Stream.iterate(this, TailCall::apply)
                 .filter(TailCall::isComplete)
                 .findFirst()
                 .get()
                 .result();
    }
}
