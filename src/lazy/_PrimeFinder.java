package lazy;

import java.util.stream.IntStream;

/**
 *
 * @author kinopp
 */
public class _PrimeFinder {

    /**
     *
     * @param number
     * @return
     */
    public static boolean isPrime(final int number) {
        return number > 1 && 
          IntStream.rangeClosed(2, (int) Math.sqrt(number))
                   .noneMatch(divisor -> number % divisor == 0);
    }
}
