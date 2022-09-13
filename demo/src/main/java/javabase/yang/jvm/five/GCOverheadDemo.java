package javabase.yang.jvm.five;

import java.util.ArrayList;
import java.util.List;

/**
* @Author:         lz
* @CreateDate:     2019-06-02 18:27
 *
 * JVM参数配置演示：
 * -Xms10m -Xmx10m -XX:+PrintGCDetails -XX:MaxDirectMemorySize=5m
 * GC回收时间长时会抛出OutOfMemoryError。过长的定义是，超过98%的时间用来做GC并且回收了
 * 不到2%的堆内存，连续多次GC都只回收了不到2%的极端情况下才会抛出。
 * 假设不抛出GC overhead limit错误会发生什么情况呢？
 * 那就是GC清理的这么点内存很快会再次填满，迫使GC再次执行，这样就形成恶性循环，CPU使用率一直
 * 是100%，而GC缺没有任何成果。
 *
 * java.lang.OutOfMemoryError: GC overhead limit exceeded
*/

public class GCOverheadDemo {
    public static void main(String[] args){
        int i = 0;
        List<String> list = new ArrayList<>();

        try{
            while(true){
                list.add(String.valueOf(++i).intern());
            }
        }catch (Throwable e){
            System.out.println("***************i:"+i);
            e.printStackTrace();
            throw e;
        }

    }
}
