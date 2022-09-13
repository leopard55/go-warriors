package javacore.setdemo;

import java.util.HashSet;

/**
 * @Title: HashSetDemo
 * @Description: TODO
 * @Author: lz
 * @CreateDate: 2021/7/1 15:42
 * @Version: 1.0
 */
public class HashSetDemo {
    public static void main(String[] args) {
        // 1. 创建一个HashSet
        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(40);
        hashSet.add(40);
        hashSet.add(50);

        System.out.println(hashSet.size());
        System.out.println(hashSet); // HashSet 是无序且去重的，存数据和取数据的顺序不一样。每次读的数据顺序一样

        System.out.println(hashSet.contains(10)); // 判断是否存在某元素  map.containsKey(o)

        hashSet.isEmpty();
        hashSet.clear();
        boolean b = hashSet.remove(10);// 只能通过元素删除

        // 重点: Set 是无序的，因此没有索引，也有没有hashSet.get(index)

        // 遍历
        for (Integer integer : hashSet) {
            System.out.println(integer);
        }

//        Collections.sort(hashSet); 报错
    }
}
