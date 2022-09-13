package javacore.listdemo1;

import java.util.Vector;

/**
 * @Title: VectorDemo
 * @Description: ArrayList与LinkedList与Vector之间的区别和联系
 * @Author: lz
 * @CreateDate: 2021/7/1 15:33
 * @Version: 1.0
 */
public class VectorDemo {
    public static void main(String[] args) {
        //1. 老集合 线程安全 底层：数组
        Vector<Integer> vector = new Vector<>();
        vector.add(23);
        vector.add(11);
        vector.add(34);

        vector.remove(0); // 根据索引删除

        for (Integer i : vector) {
            System.out.println(i);
        }

        System.out.println(vector.get(0));
    }
}
