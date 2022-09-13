package javabase.yang.jvm.five;

import java.nio.ByteBuffer;

/**
* @Author:         lz
* @CreateDate:     2019-06-02 19:01
 *
 * 配置参数：
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
 *
 * Exception in thread "main" java.lang.OutOfMemoryError: Direct buffer memory
*/

public class DirectBufferMemoryDemo {
    public static void main(String[] args) {
        System.out.println("配置的maxDirectMemory:" + (sun.misc.VM.maxDirectMemory()/(double)1024/1024) + "MB");
        try{
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        ByteBuffer bb = ByteBuffer.allocateDirect(6 * 1024 * 1024);
    }
}
