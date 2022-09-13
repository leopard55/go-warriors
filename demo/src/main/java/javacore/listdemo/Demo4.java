package javacore.listdemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Title: Demo4
 * @Description: 建议使用基础for循环和iterator.remove()进行删除
 * @Author: lz
 * @CreateDate: 2021/6/30 14:26
 * @Version: 1.0
 */
public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("e");
        list.add("a");
        list.add("z");
        // 将集合中所有的"a"元素删除（遍历）
        // 1、方法一：for循环
//        for(int i = 0; i < list.size(); i++) {
//            if("a".equals(list.get(i))){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);

        // 2、能否通过迭代器删除呢
        Iterator<String> iterator = list.iterator(); // 7个元素
//        while(iterator.hasNext()) { // 判断迭代器中是否有下一个元素
//            if("a".equals(iterator.next())) {
//                iterator.remove();
//            }
//        }

//        while(iterator.hasNext()) { // 判断迭代器中是否有下一个元素
//            String str = iterator.next();
//            if("a".equals(str)) {
//                list.remove(str); // java.util.ConcurrentModificationException 并发修改异常 迭代器和集合都要操作
//            }
//        }

        // 并发修改异常解决方案
//        ListIterator<String> listIterator = list.listIterator();
//        while(listIterator.hasNext()) { // 判断迭代器中是否有下一个元素
//            String str = listIterator.next();
//            if("a".equals(str)) {
//                listIterator.remove();
//                //list.remove(str); // 错误
//            }
//        }

        // 重点：能否使用加强for循环来删除集合中的元素呢  加强for循环没有index，普通for循环有索引
        // 加强for循环底层是迭代器（也叫for each循环）
        for (String str : list) {
            if("a".equals(str)) {
                list.remove(str);
            }
        }

        System.out.println(list);


//        list.remove("a");
//        System.out.println(list);
//        list.remove("a");
//        System.out.println(list);
    }
}
