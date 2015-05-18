package lazy;

import java.util.List;
import java.util.ArrayList;
import static lazy._PrimeFinder.isPrime;

/**
 *
 * @author kinopp
 */
public class NaivePrimes {

    /**
     *
     * @param number
     * @param numbers
     * @return
     */
    public static List<Integer> concat(
        final int number, final List<Integer> numbers) {
            final List<Integer> values = new ArrayList<>();
            values.add(number);
            values.addAll(numbers);
            return values;
        }

  //don't try this at the office

    /**
     *
     * @param number
     * @return
     */
    public static List<Integer> primes(final int number) {
        if(isPrime(number))
          return concat(number, primes(number + 1));
        else
          return primes(number + 1);
    }

    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        try {
          primes(1);
        } catch(StackOverflowError ex) {
          System.out.println(ex);
        }
    }
}
