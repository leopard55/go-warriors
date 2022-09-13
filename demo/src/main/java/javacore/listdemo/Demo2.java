package javacore.listdemo;

import java.util.ArrayList;

/**
 * @Title: Demo2
 * @Description: 泛型的主要作用：将类型的检查从运行期提前到了编译期，有效解决了下转型存在安全隐患
 * @Author: lz
 * @CreateDate: 2021/6/12 21:51
 * @Version: 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
        // JDK1.5之后的集合（解决了下转型的安全隐患：泛型）
        ArrayList<Integer> list = new ArrayList<>(); // 当前集合只能存放int整型数据
        // 1.集合中追加一个元素
        list.add(1);
        list.add(2);
        list.add(3);

        // 2.集合元素个数 str.length()  数组.length
        System.out.println(list.size());

        // 3.更新指定位置元素
        list.set(1, 888);
        System.out.println(list);

        // 4.指定索引处插入元素，add实现了方法重载
        list.add(1, 666);
        System.out.println(list);

        // 5.删除一个元素
        list.remove(0); // 指定索引删除（索引优先删除，index和元素值相同时）
        System.out.println(list);
    }
}
