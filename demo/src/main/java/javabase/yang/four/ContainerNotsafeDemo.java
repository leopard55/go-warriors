package javabase.yang.four;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 集合类不安全的问题
 * ArrayList
 */
public class ContainerNotsafeDemo {
    public static void main(String[] args) {
//        Map<String,String> map = new HashMap<>();
//        Map<String,String> map = Collections.synchronizedMap(new HashMap<>());
//        //HashMap和ConcurrentHashMap底层有何不同？
        Map<String,String> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                map.put(Thread.currentThread().getName(),UUID.randomUUID().toString().substring(0,8));
                System.out.println(map);
            }, String.valueOf(i)).start();
        }
    }

    private static void setNotSafe() {
        //        Set<String> set = new HashSet<>();
//        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        //CopyOnWriteArraySet底层CopyOnWriteArrayList
        Set<String> set = new CopyOnWriteArraySet<>();
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                set.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(set);
            }, String.valueOf(i)).start();
        }

        //HashSet 底层数据结构HashMap，初始值16，负载因子是0.75
        // default initial capacity (16) and load factor (0.75).
        //public boolean add(E e) {return map.put(e, PRESENT)==null;}
        //private static final Object PRESENT = new Object();
        new HashSet<>().add("a");
    }

    private static void listNotSafe() {
        List<String> list = Arrays.asList("a", "b", "c");
        list.forEach(System.out::println);
        list.stream().forEach(System.out::println);
//        List<String> strings = new ArrayList<>();
//        List<String> strings = new Vector<String>();
//        List<String> strings = Collections.synchronizedList(new ArrayList<>());
        List<String> strings = new CopyOnWriteArrayList<>();

        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                strings.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(strings);
            }, String.valueOf(i)).start();
        }
        //java.util.ConcurrentModificationException
        /**
         * 不要只是会用，会用只不过是API调用工程师
         * 底层原理？？？
         *
         * 1 故障现象
         *      java.util.ConcurrentModificationException
         * 2 导致原因
         *      并发争抢修改导致，参考花名册签名情况。
         *      一个人正在写，另外一个同学过俩抢夺，导致数据不一致异常，并发修改异常
         *
         * 3 解决方案
         *      3.1 Vector()
         *      3.2 Collection,Collections --- Collections.synchronizedList(new ArrayList<>())
         *      3.3 new CopyOnWriteArrayList()
         * 4 优化建议（同样的错误不犯第2次）
         *
         */}
}

    
