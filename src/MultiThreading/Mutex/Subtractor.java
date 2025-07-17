
package MultiThreading.Mutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Value v;
    Lock lock ;

    public Subtractor(Value v  , Lock lock){
        this.v = v;
        this.lock = lock ;
    }

    @Override
    public Void call() throws Exception {
//        lock.lock();
        for(int i=1;i<=1000;i++){
            lock.lock();
            v.x -= i;
            System.out.println("subtraction  " + i);
            lock.unlock() ;
        }
//        lock.unlock() ;
        return null;
    }
}