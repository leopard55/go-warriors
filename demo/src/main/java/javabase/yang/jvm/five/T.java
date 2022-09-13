package javabase.yang.jvm.five;

/**
* @Author:         lz
* @CreateDate:     2019-06-02 19:23
 *
 * Exception in thread "main" java.lang.IllegalThreadStateException
*/

public class T {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.start();
        t1.start();
    }
}
