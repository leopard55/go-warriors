package javabase.yang.jvm.five;

import java.util.Random;

/**
* @Author:         lz
* @CreateDate:     2019-06-02 18:10
 * -Xms 10m -Xmx 10m
*/

public class JavaHeapSpaceDemo {
    public static void main(String[] args){
        //byte[] bytes = new byte[80 * 1024 * 1024];
        String str = "atguigu";

        while(true){
            str += str + new Random().nextInt(11111111)+new Random().nextInt(22222222);
            str.intern();  //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        }

    }
}

