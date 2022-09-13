package javacore.listdemo1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Title: LinkedDemo
 * @Description: 使用场景：出现频繁添加、删除操作时建议使用LinkedList
 * @Author: lz
 * @CreateDate: 2021/7/1 14:48
 * @Version: 1.0
 */
public class LinkedDemo {
    public static void main(String[] args) {
        // LinkedList 通过Deque(双端队列)来实现的(双向链表)
        LinkedList<Integer> list = new LinkedList<>();

        // 链表默认往后加，从头删
        // 1.追加方法放链表元素1-2-3-4-5-6
        list.add(1);
        list.add(2);
        list.add(3);

        list.addFirst(666); // 从链表头开始添加元素
        list.addLast(888); // 从链表尾插入元素

        // 2.删除
        list.remove(); // 默认从链表头删除元素
        list.remove(1); // 删除原理：先查到再删除

        Integer integer = list.removeFirst();// 从链表头删除,返回被删除的元素怒
        Integer integer1 = list.removeLast();// 从链表尾删除
        System.out.println(list);

        // 常用方法
        list.clear(); // 清空集合
        System.out.println(list.size()); // 求集合长度

        list.contains(3); // 判断是否包含某个元素

        // 遍历
        list.get(1); // LinkedList 从链表头来设定索引为0 (线性双向链表：底层是由双端队列实现的)

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer i : list) {
            System.out.println(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Collections.sort(list); // 快速排序
        Collections.shuffle(list); // 随机源置换（打乱）
    }
}
