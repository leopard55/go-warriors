package javacore.listdemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Title: Demo3
 * @Description: 集合遍历
 * @Author: lz
 * @CreateDate: 2021/6/12 22:03
 * @Version: 1.0
 */
public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(90);
        list.add(50);
        // list是有序的，存和取得顺序一致
        System.out.println(list);

        // 1.集合的基础for循环遍历,必须熟练掌握
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 2.集合的迭代器遍历
        Iterator<Integer> iterator = list.iterator(); // 将集合放入到迭代器中（放入一个容器中，并且每个小隔间都有指针）
        while (iterator.hasNext()) { // 判断迭代器中是否有下一个元素，若到了集合最后则返回false
            System.out.println(iterator.next());
        }

//        Integer n1 = iterator.next(); //每次next()都会返回一个当前值，并且将指针指向下一个元素
//        Integer n2 = iterator.next();
//        Integer n3 = iterator.next();
//        Integer n4 = iterator.next(); // java.util.NoSuchElementException 找不到元素（已经访问到了集合的最后位置）


        // 3.集合的加强for循环遍历 （底层就是迭代器实现的，只不过它是一种简写方式）
        for (int i : list) {
            System.out.println(i);
        }

//        加强for循环语法
//                for(迭代后的类型 变量 : 可以迭代的对象) {
//                    循环体;
//                }

    }
}
