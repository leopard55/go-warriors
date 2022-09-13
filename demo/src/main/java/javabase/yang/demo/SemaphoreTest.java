package javabase.yang.demo; /**
* @Author:         lz
* @CreateDate:     2019-06-24 15:52
 *
 * permits the initial number of permits available. This value may be negative,
 * in which case releases must occur before any acquires will be granted.
 * fair true if this semaphore will guarantee first-in first-out granting of
 * permits under contention, else false
 *
*/

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static Semaphore semaphore = new Semaphore(5,true);

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                test();
            }).start();
        }
    }

    public static void test(){
        try{
            semaphore.acquire();

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"进来了");
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"走了");
        semaphore.release();
    }
}
