package javabase.yang.jvm.five;

//import net.sf.cglib.proxy.Enhancer;

/**
* @Author:         lz
* @CreateDate:     2019-06-02 20:50
 *
 * JVM参数
 * -XX:MetaspaceSize=8m -XX:MaxMetaspaceSize=8m
 *
 * Java8之后的版本使用Metaspace来替代永久代
 * Metaspace是方法区在HotSpot中的实现，它与持久带最大的区别在于：Metaspace并不在虚拟机内存中而是使用
 * 本地内存，也即在java8中，class metaspace（the virtual machines internal presentation of java class）
 * ,被存储在叫做Metaspace的native memory
 *
 * 永久代（java8以后被元空间Metaspace取代了）存放以下信息：
 * 虚拟机加载的类信息
 * 常量池
 * 静态变量
 * 即时编译后的代码
 *
 * 模拟Metaspace空间溢出，我们不断生成类往元空间灌，类占据的空间总是会超过Metaspace指定的空间大小的
*/

public class MetaspaceOOMT {
    static class OOMTest{

    }
    public static void main(String[] args){
        int i=0;//模拟多少次后发生异常

        try{
            while (true){
                i++;
//                Enhancer enhancer = new Enhancer();
//                enhancer.setSuperclass(OOMTest.class);
//                enhancer.setUseCache(false);
//                enhancer.setCallback(new MethodInterceptor);
            }
        }catch (Throwable e){
            System.out.println("********多少次后发生了异常："+i);
            e.printStackTrace();
        }
    }
}

