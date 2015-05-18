package resources;

import java.util.concurrent.locks.Lock;

/**
 *
 * @author kinopp
 */
public class _Locker {

    /**
     *
     * @param lock
     * @param block
     */
    public static void runLocked(Lock lock, Runnable block) {
        lock.lock();
	
        try {
            block.run();
        } finally {
            lock.unlock();
        }    
    }
}
