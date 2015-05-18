package lazy;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static lazy._PrimeFinder.isPrime;

/**
 *
 * @author kinopp
 */
public class Primes {
    private static int primeAfter(final int number) {
        if(isPrime(number + 1))
          return number + 1;
        else
          return primeAfter(number + 1);
    }
  
    /**
     *
     * @param fromNumber
     * @param count
     * @return
     */
    public static List<Integer> primes(final int fromNumber, final int count) {
        return Stream.iterate(primeAfter(fromNumber - 1), Primes::primeAfter)
                     .limit(count)
                     .collect(Collectors.<Integer>toList());
    }  
  //...
  
    /**
     * メイン
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println("10 primes from 1: " + primes(1, 10));
        System.out.println("5 primes from 100: " + primes(100, 5));
    }

}
