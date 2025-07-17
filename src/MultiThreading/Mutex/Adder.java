package MultiThreading.Mutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value v;
    Lock lock ;

    public Adder(Value v , Lock lock){
        this.v = v;
        this.lock = lock ;
    }

    @Override
    public Void call() throws Exception {
//        lock.lock() ;
        for(int i=1;i<=1000;i++){
            lock.lock() ;
            v.x += i;
            System.out.println("addition  " + i);
            lock.unlock()  ;
        }

//     lock.unlock()  ;
//         --> this is not the right place to use the  lock , it is necessary to understand where it is required
        return null;
    }
}