package javabase.yang.jvm.five;

/**
* @Author:         lz
* @CreateDate:     2019-06-02 17:58
*/

public class StackOverflowErrorDemo {

    public static void main(String[] args) {
        stackOverflowError();
    }

    private static void stackOverflowError() {
        stackOverflowError();   //Exception in thread "main" java.lang.StackOverflowError
    }

}
