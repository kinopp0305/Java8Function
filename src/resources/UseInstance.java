package resources;

/**
 *
 * @author kinopp
 * @param <T>
 * @param <X>
 */
@FunctionalInterface
public interface UseInstance<T, X extends Throwable> {

    /**
     *
     * @param instance
     * @throws UseInstance.X
     */
    void accept(T instance) throws X;
}
  
