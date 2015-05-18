package resources;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import static resources._Locker.runLocked;

/**
 *
 * @author kinopp
 */
public class _Locking {
    Lock lock = new ReentrantLock(); //or mock
  
    /**
     *
     * @param mock
     */
    protected void setLock(final Lock mock) {
        lock = mock;
    } 

    /**
     *
     */
    public void doOp1() {
        lock.lock();
        try {
      //...critical code...
        } finally {
            lock.unlock();
        }
    }
  //...

    /**
     *
     */
    public void doOp2() {
        runLocked(lock, () -> {/*...critical code ... */});
    }
  
    /**
     *
     */
    public void doOp3() {
        runLocked(lock, () -> {/*...critical code ... */});
    }
  
    /**
     *
     */
    public void doOp4() {
        runLocked(lock, () -> {/*...critical code ... */});
    }

}
